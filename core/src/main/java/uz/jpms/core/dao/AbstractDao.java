package uz.jpms.core.dao;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDao<T, ID> implements BaseDao<T, ID> {

    protected final Map<ID, T> storage = new HashMap<>(100);

}
