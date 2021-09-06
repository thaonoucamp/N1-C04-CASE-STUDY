package codegym.service;


public interface GeneralCRUD<T> {
    Iterable<T> findAll();

    T findById(Long id);

    T save(T t);

    void delete(Long id);
}
