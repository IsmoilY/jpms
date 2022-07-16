package uz.jpms.core.dao;

import uz.jpms.core.domain.BaseEntity;

import java.util.*;

public abstract class AbstractDao<T extends BaseEntity<ID>, ID> implements BaseDao<T, ID> {

    private static final int INITIAL_CAPACITY = 100;

    protected final Map<ID, T> storage = new HashMap<>(INITIAL_CAPACITY);

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public T save(T t) {
        if (Objects.isNull(t.getId())) {
            t.setId(t.generateId());
        }
        return storage.put(t.getId(), t);
    }

    @Override
    public List<T> saveAll(List<T> list) {
        for (T t : list) {
            save(t);
        }
        return list;
    }

    @Override
    public void deleteById(ID id) {
        storage.remove(id);
    }

}