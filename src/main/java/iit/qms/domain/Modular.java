package iit.qms.domain;

import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;

import java.util.Optional;

public interface Modular {

     <E extends Module> Process start(E e);

     Optional<Process> getProcess(Long id);

}
