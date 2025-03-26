package iit.qms.domain.context;

import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;

import java.util.Optional;

public interface WorkflowContext {

    <E extends Module> Process startModule(E e);

    Optional<Process> getProcess(Long processId);

}
