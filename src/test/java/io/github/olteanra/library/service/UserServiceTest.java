package io.github.olteanra.library.service;

import io.github.olteanra.library.domain.User;
import io.github.olteanra.library.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * @author Rares Oltean
 */
public class UserServiceTest {

    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Before
    public void setup() {
        initMocks(this);
        userService = new UserService(userRepository);
    }

    @Test
    public void testGetAll() {
        given(userRepository.getUsers()).willReturn(Collections.singletonList(new User("John Doe", "john.doe", "test1234")));

        List<User> users = userService.getUsers();
        assertThat(users).isNotEmpty().hasSize(1);
    }

}
