package uz.jpms.recommendation;

public class RecommendationFactory {

    private static BookRecommender recommender;

    public static BookRecommender createBookRecommender() {
        return recommender;
    }

}
