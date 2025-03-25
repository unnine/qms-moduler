package iit.qms.web.sample.service.impl;

import iit.qms.domain.Modular;
import iit.qms.domain.module.capa.Capa;
import iit.qms.domain.process.Process;
import iit.qms.web.sample.service.CapaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
        Process process = modular.getProcess(processId);
        process.toNext();
    }

    @Override
    public void search() {

    }
}
