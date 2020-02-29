package com.mycompany.auth;

import com.mycompany.auth.model.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryUserService implements UserCrudService {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User findByUsername(String username) {
        return users.values().stream()
                .filter(user -> user.getUsername().equals(user))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException(String.format("User with login %s not found", username)));
    }

    @Override
    public User find(String id) {
        return users.get(id);
    }

    @Override
    public void remove(User user) {
        users.remove(user.getId());
    }
}
