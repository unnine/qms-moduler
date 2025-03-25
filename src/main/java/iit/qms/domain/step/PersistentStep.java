package iit.qms.domain.step;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersistentStep<E extends Step> implements Step {

    private final E step;

    private final StepRepository<E> stepRepository;


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
        stepRepository.update(step);
    }

    @Override
    public void finish() {
        step.finish();
        stepRepository.update(step);
    }
}
