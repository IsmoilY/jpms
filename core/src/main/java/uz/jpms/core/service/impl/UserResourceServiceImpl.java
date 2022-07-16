package uz.jpms.core.service.impl;

import uz.jpms.core.dao.UserResourceDao;
import uz.jpms.core.domain.user.User;
import uz.jpms.core.domain.user.UserResource;
import uz.jpms.core.service.UserResourceService;

import java.util.List;

public class UserResourceServiceImpl implements UserResourceService {

    private final UserResourceDao dao;

    public UserResourceServiceImpl(UserResourceDao dao) {
        this.dao = dao;
    }

    @Override
    public List<UserResource> findAll() {
        return dao.findAll();
    }

    @Override
    public UserResource findByUser(User user) {
        return findAll()
                .stream()
                .filter(resource -> resource.getUser().equals(user))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public UserResource createOrUpdate(UserResource resource) {
        return dao.save(resource);
    }

}
