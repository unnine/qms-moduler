package iit.qms.web.sample.service.impl;

import iit.qms.domain.module.Modular;
import iit.qms.domain.module.capa.entity.Capa;
import iit.qms.domain.module.Process;
import iit.qms.domain.module.ProcessId;
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
    public void toNextProcess() {
        modular.toNext(new ProcessId());
    }

    @Override
    public void search() {

    }
}
