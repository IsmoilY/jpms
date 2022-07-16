package uz.jpms.recommendation;

import uz.jpms.core.domain.book.Book;

public class BookRecommendationDTO {

    private final Book book;
    private final Integer rate;

    public BookRecommendationDTO(Book book, Integer rate) {
        this.book = book;
        this.rate = rate;
    }

    public Book getBook() {
        return book;
    }

    public Integer getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "BookRecommendationDTO{" +
                "book=" + book +
                ", rate=" + rate +
                '}';
    }
}
