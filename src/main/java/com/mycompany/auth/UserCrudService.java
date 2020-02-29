package com.mycompany.auth;

import com.mycompany.auth.model.User;

public interface UserCrudService {
    void save(User user);

    User findByUsername(String username);

    User find(String id);

    void remove(User user);
}
