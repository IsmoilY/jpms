package uz.jpms.core.domain.book;

import uz.jpms.core.domain.BaseEntity;
import uz.jpms.core.util.EntityUtil;

import java.util.Objects;

public class Book implements BaseEntity<Long> {

    private Long id;
    private String title;
    private String isbn;
    private Integer publishedAt;
    private String author;

    private BookGenre genre;
    private BookCategory category;

    private Integer quantity = 0;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Integer publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity of a book cannot be less than 1");
        }
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(isbn, book.isbn) && Objects.equals(publishedAt, book.publishedAt) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre) && Objects.equals(category, book.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isbn, publishedAt, author, genre, category);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishedAt=" + publishedAt +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", category=" + category +
                '}';
    }
}
