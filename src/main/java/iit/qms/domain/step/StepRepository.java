package iit.qms.domain.step;

import iit.qms.domain.context.repository.DataAccessRepository;

public interface StepRepository<E extends Step, ID> extends DataAccessRepository<E, ID> {
}
