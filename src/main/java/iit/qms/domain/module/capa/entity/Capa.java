package iit.qms.domain.module.capa.entity;

import iit.qms.domain.module.Module;
import iit.qms.domain.module.ModuleType;

public class Capa implements Module {

    @Override
    public ModuleType getId() {
        return ModuleType.CAPA;
    }
}
