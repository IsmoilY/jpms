package uz.jpms.core.dao;

import java.util.List;
import java.util.Optional;

public interface BaseDao<T, ID> {

    Optional<T> findById(ID id);

    List<T> findAll();

    T save();

    List<T> saveAll();

    void deleteById(ID id);

}
