package iit.qms.domain.context;

import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;

public interface ProcessProgressContext {

    <E extends Module> Process startModule(E e);

    Process getProcess(Long processId);

}
