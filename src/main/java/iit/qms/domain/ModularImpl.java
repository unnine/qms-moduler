package iit.qms.domain;

import iit.qms.domain.context.WorkflowContext;
import iit.qms.domain.module.Module;
import iit.qms.domain.process.Process;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ModularImpl implements Modular {

     private final WorkflowContext processContainer;


     @Override
     public <E extends Module> Process start(E e) {
          return processContainer.startModule(e);
     }

     @Override
     public Optional<Process> getProcess(Long id) {
          return processContainer.getProcess(id);
     }
}
