package com.mycompany.auth;

import com.mycompany.auth.model.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UuidAuthenticationService implements UserAuthenticationService {
    private final UserCrudService userCrudService;

    public UuidAuthenticationService(UserCrudService userCrudService) {
        this.userCrudService = userCrudService;
    }

    @Override
    public String login(String username, String password) {
        String uuidToken = UUID.randomUUID().toString();
        User user = new User(
                uuidToken,
                username,
                password
        );

        userCrudService.save(user);
        return uuidToken;
    }

    @Override
    public User findByToken(String token) {
        return userCrudService.find(token);
    }

    @Override
    public void logout(User user) {
        userCrudService.remove(user);
    }
}
