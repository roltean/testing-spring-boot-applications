package io.github.olteanra.library.repository;

import io.github.olteanra.library.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Rares Oltean
 */
@EnableAutoConfiguration
public class UserRepositoryTest extends AbstractRepositoryTest {

    private UserRepository userRepository;

    @Before
    public void setup() {
        userRepository = new UserRepository(jdbcTemplate);
    }

    @Test
    public void testGetUsers() {
        List<User> users = userRepository.getUsers();
        assertThat(users).isNotEmpty().hasSize(2);
    }

}
