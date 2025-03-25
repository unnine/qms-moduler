package iit.qms.domain.context.repository;

public interface DataAccessRepository<E> {

    void insert(E step);

    void update(E step);

    void delete(E step);
}
