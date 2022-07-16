package uz.jpms.core.service;

import uz.jpms.core.dao.UserResourceDao;
import uz.jpms.core.domain.user.User;
import uz.jpms.core.domain.user.UserResource;
import uz.jpms.core.service.impl.UserResourceServiceImpl;

import java.util.List;

public interface UserResourceService {

    UserResourceService service = new UserResourceServiceImpl(UserResourceDao.provide());

    static UserResourceService provide() {
        return service;
    }

    List<UserResource> findAll();

    UserResource findByUser(User user);

    UserResource createOrUpdate(UserResource resource);

}
