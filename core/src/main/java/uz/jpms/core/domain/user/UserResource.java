package uz.jpms.core.domain.user;

import uz.jpms.core.domain.BaseEntity;
import uz.jpms.core.domain.book.Book;
import uz.jpms.core.util.EntityUtil;
import uz.jpms.notification.Notifier;

import java.util.HashSet;
import java.util.ServiceLoader;
import java.util.Set;

public class UserResource implements BaseEntity<Long> {

    private Long id;
    private User user;
    private final Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        books.add(book);

        for (Notifier notifier : ServiceLoader.load(Notifier.class)) {
            notifier.sendMessage();
        }

    }

    public void removeBook(Book book) {
        books.remove(book);
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Book> getBooks() {
        return books;
    }

}
