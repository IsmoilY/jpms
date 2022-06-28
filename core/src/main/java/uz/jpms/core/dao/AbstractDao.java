package uz.jpms.core.dao;

import java.util.*;

public abstract class AbstractDao<T, ID> implements BaseDao<T, ID> {

    protected final Map<ID, T> storage = new HashMap<>(100);

    protected long idGenerator = 0L;

    public long generateLongID() {
        return idGenerator++;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public List<T> saveAll(List<T> list) {
        list.forEach(this::save);
        return list;
    }

    @Override
    public void deleteById(ID id) {
        storage.remove(id);
    }

}
