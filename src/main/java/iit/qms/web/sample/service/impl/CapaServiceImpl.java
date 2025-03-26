package iit.qms.web.sample.service.impl;

import iit.qms.domain.Modular;
import iit.qms.domain.module.capa.entity.Capa;
import iit.qms.domain.process.Process;
import iit.qms.web.sample.service.CapaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CapaServiceImpl implements CapaService {

    private final Modular modular;


    @Override
    public void request() {
        Process process = modular.start(new Capa());
        process.toNext();
    }

    @Override
    public void toNextProcess(Long processId) {
        Optional<Process> processOptional = modular.getProcess(processId);
        processOptional.ifPresentOrElse(Process::toNext, () -> log.warn("not found process of process id: '" + processId + "'"));
    }

    @Override
    public void search() {

    }
}
