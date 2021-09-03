package codegym.service;

import java.util.List;

public interface GeneralCRUD<T> {
    List<T> findAll();

    T findById(Long id);

    T save(T t);

    void delete(Long id);
}
