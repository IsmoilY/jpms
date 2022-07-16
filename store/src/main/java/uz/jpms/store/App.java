package uz.jpms.store;

import uz.jpms.core.dao.BookCategoryDao;
import uz.jpms.core.dao.BookGenreDao;
import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.book.BookCategory;
import uz.jpms.core.domain.book.BookGenre;
import uz.jpms.core.domain.user.User;
import uz.jpms.core.domain.user.UserResource;
import uz.jpms.core.domain.user.UserType;
import uz.jpms.core.service.BookService;
import uz.jpms.core.service.UserResourceService;
import uz.jpms.core.service.UserService;
import uz.jpms.logger.Logger;
import uz.jpms.logger.LoggerFactory;
import uz.jpms.recommendation.BookRecommendationDTO;
import uz.jpms.recommendation.BookRecommender;
import uz.jpms.recommendation.RecommendationFactory;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final Logger log = LoggerFactory.create(App.class);

    static BookService bookService = BookService.provide();
    static BookGenreDao bookGenreDao = BookGenreDao.provide();
    static BookCategoryDao bookCategoryDao = BookCategoryDao.provide();
    static UserService userService = UserService.provide();
    static UserResourceService userResourceService = UserResourceService.provide();
    static BookRecommender bookRecommender = RecommendationFactory.createBookRecommender();

    public static void main(String[] args) {
        System.out.println("==========================================\n" +
                "||             STORE OPEN               ||\n" +
                "==========================================");

        populateSimulationData();

        User user = userService.findByUsername("user1");
        showRecommendedBooks();
        buyBook(user);


        System.out.println("\n==========================================\n" +
                "||            STORE CLOSED              ||\n" +
                "==========================================");
    }

    static void buyBook(User user) {
        Book book = bookRecommender.getRecommendedBooks()
                .stream()
                .findAny()
                .orElseThrow()
                .getBook();

        UserResource userResource = userResourceService.findByUser(user);
        userResource.addBook(book);
        userResourceService.createOrUpdate(userResource);

        log.info(user.getName() + " bought a book " + book);
    }

    static void showRecommendedBooks() {
        System.out.println("\nTOP RECOMMENDED BOOKS");
        List<BookRecommendationDTO> recommendedBooks = new ArrayList<>(bookRecommender.getRecommendedBooks());
        for (int i = 0; i < recommendedBooks.size(); i++) {
            System.out.println((i + 1) + ") " + recommendedBooks.get(i));
        }
        System.out.println();
    }

    static void populateSimulationData() {
        User user = new User();
        user.setUsername("user1");
        user.setPassword("");
        user.setName("User Family");
        user.setType(UserType.USER);
        userService.createOrUpdate(user);

        BookGenre fantasy = new BookGenre("Fantasy");
        BookGenre classics = new BookGenre("Classics");
        bookGenreDao.save(fantasy);
        bookGenreDao.save(classics);

        BookCategory programming = new BookCategory("Programming");
        BookCategory comic = new BookCategory("Programming");
        bookCategoryDao.save(programming);
        bookCategoryDao.save(comic);

        Book book1 = new Book();
        book1.setTitle("Book1");
        book1.setPublishedAt(2020);
        book1.setAuthor("1111");
        book1.setGenre(fantasy);
        book1.setCategory(comic);
        book1.setIsbn("IS0013123");
        book1.setQuantity(100);

        Book book2 = new Book();
        book2.setTitle("Book2");
        book2.setPublishedAt(2021);
        book2.setAuthor("2222");
        book2.setGenre(classics);
        book2.setCategory(programming);
        book2.setIsbn("IS0113123");
        book2.setQuantity(200);

        bookService.createOrUpdate(book1);
        bookService.createOrUpdate(book2);


        UserResource resource = new UserResource();
        resource.setUser(user);
        resource.addBook(book1);
        resource.addBook(book2);
        userResourceService.createOrUpdate(resource);

        log.info("Store simulation data populated");
    }

}
