package io.github.olteanra.library.service;

import io.github.olteanra.library.domain.User;
import io.github.olteanra.library.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rares Oltean
 */
@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.getUsers();
    }
}
