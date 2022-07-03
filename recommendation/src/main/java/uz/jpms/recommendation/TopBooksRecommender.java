package uz.jpms.recommendation;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.user.UserResource;
import uz.jpms.core.service.UserResourceService;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopBooksRecommender implements BookRecommender {

    private static final int TOP_N_ELEMENTS = 3;

    private final UserResourceService service;

    public TopBooksRecommender(UserResourceService service) {
        this.service = service;
    }

    @Override
    public Collection<BookRecommendationDTO> getRecommendedBooks() {
        List<UserResource> userResources = service.findAll();
        List<Book> allBoughtBooks = userResources
                .stream()
                .map(UserResource::getBooks)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        Map<Long, List<Book>> collect = allBoughtBooks
                .stream()
                .collect(Collectors.groupingBy(Book::getId));

        return collect
                .values()
                .stream()
                .map(books -> new BookRecommendationDTO(books.get(0), books.size()))
                .sorted(Comparator.comparing(BookRecommendationDTO::getRate).reversed())
                .limit(TOP_N_ELEMENTS)
                .collect(Collectors.toSet());
    }

}
