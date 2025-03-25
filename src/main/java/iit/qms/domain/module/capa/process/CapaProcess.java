package iit.qms.domain.module.capa.process;

import iit.qms.domain.module.Process;
import iit.qms.domain.module.Step;

import java.util.ArrayList;
import java.util.List;

public class CapaProcess implements Process {

    private final List<Step> steps = new ArrayList<>();


    @Override
    public void toPrev() {

    }

    @Override
    public void toNext() {

    }
}
