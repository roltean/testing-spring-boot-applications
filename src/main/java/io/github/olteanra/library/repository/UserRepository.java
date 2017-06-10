package io.github.olteanra.library.repository;

import io.github.olteanra.library.domain.User;
import io.github.olteanra.library.repository.rowmapper.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rares Oltean
 */
@Repository
public class UserRepository {

    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> getUsers() {
        final String GET_ALL_QUERY = "SELECT * FROM Users";
        return jdbcTemplate.query(GET_ALL_QUERY, new UserRowMapper());
    }

}
