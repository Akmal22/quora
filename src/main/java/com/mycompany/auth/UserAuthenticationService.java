package com.mycompany.auth;

import com.mycompany.auth.model.User;

public interface UserAuthenticationService {
    String login(String username, String password);

    User findByToken(String token);

    void logout(User user);
}
