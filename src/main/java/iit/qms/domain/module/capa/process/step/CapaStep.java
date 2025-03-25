package iit.qms.domain.module.capa.process.step;

import iit.qms.domain.module.StepType;

public enum CapaStep implements StepType {
    REQUEST,
    RECEIPT,
    PLAN,
    RESULT,
    ASSESSING_EFFICACY,
    END,
}
