package iit.qms.domain.module.capa.entity;

import iit.qms.domain.step.NextSteps;
import iit.qms.domain.step.Step;

public class CapaEndStep implements Step {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public NextSteps getNextSteps() {
        return null;
    }

    @Override
    public void enter() {

    }

    @Override
    public void finish() {

    }
}
