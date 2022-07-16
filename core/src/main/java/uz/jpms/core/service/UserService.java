package uz.jpms.core.service;

import uz.jpms.core.dao.UserDao;
import uz.jpms.core.domain.user.User;
import uz.jpms.core.service.impl.UserServiceImpl;

import java.util.List;

public interface UserService {

    UserService service = new UserServiceImpl(UserDao.provide());

    static UserService provide() {
        return service;
    }

    User createOrUpdate(User user);

    User findById(Long userId);

    User findByUsername(String username);

    List<User> findAll();

    void delete(Long userId);

}
