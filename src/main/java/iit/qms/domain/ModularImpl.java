package iit.qms.domain;

import iit.qms.domain.context.ProcessProgressContext;
import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModularImpl implements Modular {

     private final ProcessProgressContext processContextService;


     @Override
     public <E extends Module> Process start(E e) {
          return processContextService.startModule(e);
     }

     @Override
     public Process getProcess(Long id) {
          return processContextService.getProcess(id);
     }
}
