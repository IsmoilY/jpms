package uz.jpms.recommendation;

import uz.jpms.core.service.UserResourceService;

public class RecommendationFactory {

    private static final BookRecommender recommender = new TopBooksRecommender(UserResourceService.provide());

    public static BookRecommender createBookRecommender() {
        return recommender;
    }

}
