package iit.qms.domain.context;

import iit.qms.domain.step.Step;
import iit.qms.domain.step.StepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DataAccessRepositoryContext {

    private final Map<String, StepRepository<? extends Step, ?>> stepRepositories = new HashMap<>();


    @SuppressWarnings("rawtypes, unchecked")
    public DataAccessRepositoryContext(ApplicationContext applicationContext) {
        Map<String, StepRepository> repositories = applicationContext.getBeansOfType(StepRepository.class);
        String genericTypeName;

        for (StepRepository repository : repositories.values()) {
            genericTypeName = genericTypeNameOf(repository);
            stepRepositories.put(genericTypeName, repository);
        }
    }


    public StepRepository<? extends Step, ?> getStepRepository(Step step) {
        return stepRepositories.get(step.getClass().getTypeName());
    }

    private String genericTypeNameOf(Object o) {
        Class<?> implementsClass = getImplementsClass(o);
        if (isObjectType(implementsClass)) {
            return null;
        }
        Optional<Type[]> genericTypesOptional = getActualGenericTypes(implementsClass);

        if (genericTypesOptional.isEmpty()) {
            return null;
        }

        Type[] types = genericTypesOptional.get();

        if (types.length == 0) {
            return null;
        }
        return types[0].getTypeName();
    }

    private Class<?> getImplementsClass(Object o) {
        try {
            Type genericSuperclass = o.getClass().getGenericSuperclass();
            return Class.forName(genericSuperclass.getTypeName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Optional<Type[]> getActualGenericTypes(Class<?> clazz) {
        if (clazz == null) {
            return Optional.empty();
        }
        return Arrays.stream(clazz.getGenericInterfaces())
                .map(type -> (ParameterizedType) type)
                .map(ParameterizedType::getActualTypeArguments)
                .findAny();
    }

    private boolean isObjectType(Class<?> clazz) {
        return Object.class.getTypeName().equals(clazz.getTypeName());
    }
}
