package iit.qms.domain.context;

import iit.qms.domain.context.repository.ProcessContextRepository;
import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersistentProcessProgressContext implements ProcessProgressContext {

    private final ProcessContextRepository processContextRepository;


    @Override
    public <E extends Module> Process startModule(E e) {
        return null;
    }

    @Override
    public Process getProcess(Long processId) {
        return null;
    }
}
