package uz.jpms.core.domain;

public interface BaseEntity<ID> {

    ID generateId();

    ID getId();

    void setId(ID id);

}
