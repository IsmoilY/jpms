package uz.jpms.core.domain.book;

public class BookCategory {

    private final Long id;
    private final String name;

    public BookCategory(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
