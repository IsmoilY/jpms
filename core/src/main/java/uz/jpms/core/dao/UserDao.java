package uz.jpms.core.dao;

import uz.jpms.core.domain.user.User;

public class UserDao extends AbstractDao<User, Long> {

    private static final UserDao dao = new UserDao();

    public static UserDao provide() {
        return dao;
    }

}
