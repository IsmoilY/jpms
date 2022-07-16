package uz.jpms.core.dao;

import uz.jpms.core.domain.user.UserResource;

public class UserResourceDao extends AbstractDao<UserResource, Long> {

    private static final UserResourceDao dao = new UserResourceDao();

    public static UserResourceDao provide() {
        return dao;
    }

}
