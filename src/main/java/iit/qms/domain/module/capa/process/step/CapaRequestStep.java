package iit.qms.domain.module.capa.process.step;

import iit.qms.domain.module.Step;
import iit.qms.domain.module.StepType;

public class CapaRequestStep implements Step {


    @Override
    public StepType type() {
        return CapaStep.REQUEST;
    }
}
