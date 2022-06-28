package uz.jpms.core.dao;

import uz.jpms.core.domain.user.User;

import java.util.List;
import java.util.Optional;

public class UserDao extends AbstractDao<User, Long> {

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User save() {
        return null;
    }

    @Override
    public List<User> saveAll() {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
