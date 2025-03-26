package iit.qms.domain.context.repository;

import java.util.List;

public interface DataAccessRepository<E, ID> {

    List<E> findAll();

    E findById(ID id);

    void insert(E e);

    void update(E e);

    void delete(E e);
}
