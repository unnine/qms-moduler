package iit.qms.domain;

import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;

public interface Modular {

     <E extends Module> Process start(E e);

     Process getProcess(Long id);

}
