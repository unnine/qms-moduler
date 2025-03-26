package iit.qms.domain.step;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersistentStep implements Step {

    private final Step step;

    private final StepRepository<? extends Step, ?> stepRepository;


    @Override
    public boolean hasNext() {
        return step.hasNext();
    }

    @Override
    public NextSteps getNextSteps() {
        return step.getNextSteps();
    }

    @Override
    public void enter() {
        step.enter();
//        stepRepository.update(step);
    }

    @Override
    public void finish() {
        step.finish();
//        stepRepository.update(step);
    }
}
