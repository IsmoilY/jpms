package uz.jpms.core.service;

import uz.jpms.core.domain.user.User;
import uz.jpms.core.domain.user.UserResource;

import java.util.List;

public interface UserService {

    UserResource getResource();

    User createOrUpdate(User user);

    User findById(Long userId);

    User findByUsername(String username);

    List<User> findAll();

    void delete(Long userId);

}
