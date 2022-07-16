package uz.jpms.core.service.impl;

import uz.jpms.core.dao.UserDao;
import uz.jpms.core.domain.user.User;
import uz.jpms.core.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User createOrUpdate(User user) {
        return dao.save(user);
    }

    @Override
    public User findById(Long userId) {
        return dao.findById(userId).orElseThrow();
    }

    // just for simulation
    @Override
    public User findByUsername(String username) {
        return findAll()
                .stream()
                .filter(user -> user.getUsername().equals(username))
                .findAny()
                .orElseThrow();
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(Long userId) {
        dao.deleteById(userId);
    }
}
