package iit.qms.domain.process;

import iit.qms.domain.step.NextSteps;
import iit.qms.domain.step.Step;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StandardProcess implements Process {

    private final Step currentStep;


    @Override
    public void toNext() {
        finish();

        if (currentStep.hasNext()) {
            enterNextSteps();
        }
    }

    private void finish() {
        currentStep.finish();
    }

    private void enterNextSteps() {
        NextSteps nextSteps = currentStep.getNextSteps();
        nextSteps.forEach(Step::enter);
    }
}
