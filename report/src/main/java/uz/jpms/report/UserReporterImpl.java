package uz.jpms.report;

import uz.jpms.core.domain.book.Book;
import uz.jpms.core.domain.user.User;
import uz.jpms.core.domain.user.UserResource;
import uz.jpms.core.service.UserResourceService;
import uz.jpms.core.service.UserService;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserReporterImpl implements UserReporter {

    private final UserService userService;
    private final UserResourceService resourceService;

    public UserReporterImpl(UserService userService, UserResourceService resourceService) {
        this.userService = userService;
        this.resourceService = resourceService;
    }

    @Override
    public Integer countActiveUsers() {
        return (int) userService.findAll().stream().filter(User::getActive).count();
    }

    @Override
    public Integer countInActiveUsers() {
        return (int) userService.findAll().stream().filter(user -> !user.getActive()).count();
    }

    @Override
    public Map<User, Set<Book>> userBooks() {
        return resourceService.findAll()
                .stream()
                .collect(Collectors.toMap(UserResource::getUser, UserResource::getBooks));
    }
}
