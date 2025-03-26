package iit.qms.domain.module;

import iit.qms.domain.context.repository.DataAccessRepository;

public interface ModuleRepository<E extends Module, ID> extends DataAccessRepository<E, ID> {
}
