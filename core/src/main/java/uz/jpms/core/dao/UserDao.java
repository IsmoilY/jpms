package uz.jpms.core.dao;

import uz.jpms.core.domain.user.User;

import java.util.Objects;

public class UserDao extends AbstractDao<User, Long> {

    @Override
    public User save(User user) {
        if (Objects.isNull(user.getId())) {
            user.setId(generateLongID());
        }
        return storage.put(user.getId(), user);
    }

}
