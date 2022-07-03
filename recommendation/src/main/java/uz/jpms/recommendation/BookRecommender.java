package uz.jpms.recommendation;

import java.util.Collection;

public interface BookRecommender {

    Collection<BookRecommendationDTO> getRecommendedBooks();

}
