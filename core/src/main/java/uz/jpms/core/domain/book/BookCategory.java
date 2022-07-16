package uz.jpms.core.domain.book;

import uz.jpms.core.domain.BaseEntity;
import uz.jpms.core.util.EntityUtil;

public class BookCategory implements BaseEntity<Long> {

    private Long id;
    private String name;

    public BookCategory() {
    }

    public BookCategory(String name) {
        this.name = name;
    }

    @Override
    public Long generateId() {
        return EntityUtil.generateLongID();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
