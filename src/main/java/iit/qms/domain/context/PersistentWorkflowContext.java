package iit.qms.domain.context;

import iit.qms.domain.context.entity.ModuleDefinition;
import iit.qms.domain.context.entity.Workflow;
import iit.qms.domain.context.repository.ModuleDefinitionRepository;
import iit.qms.domain.context.repository.WorkflowRepository;
import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;
import iit.qms.domain.process.StandardProcess;
import iit.qms.domain.step.PersistentStep;
import iit.qms.domain.step.Step;
import iit.qms.domain.step.StepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PersistentWorkflowContext implements WorkflowContext {

    private final ModuleDefinitionRepository moduleDefinitionRepository;
    private final WorkflowRepository workflowRepository;
    private final DataAccessRepositoryContext repositoryContext;

    @Override
    public <E extends Module> Process startModule(E e) {
        ModuleDefinition moduleDefinition = moduleDefinitionRepository.findBy(e.getId());

        return null;
    }

    @Override
    public Optional<Process> getProcess(Long processId) {
        Optional<Workflow> workflowOptional = workflowRepository.findByProcessId(processId);

        if (workflowOptional.isEmpty()) {
            return Optional.empty();
        }
        Workflow workflow = workflowOptional.get();
        Step currentStep = workflow.getCurrentStep();
        StepRepository<? extends Step, ?> currentStepRepository = repositoryContext.getStepRepository(currentStep);

        PersistentStep persistentStep = new PersistentStep(currentStep, currentStepRepository);
        StandardProcess process = new StandardProcess(persistentStep);

        return Optional.of(process);
    }
}
