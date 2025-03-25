package iit.qms.domain.step;

import iit.qms.domain.context.repository.DataAccessRepository;
import iit.qms.domain.step.Step;

public interface StepRepository<E extends Step> extends DataAccessRepository<E> {
}
