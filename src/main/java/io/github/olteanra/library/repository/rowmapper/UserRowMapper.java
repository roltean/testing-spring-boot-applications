package io.github.olteanra.library.repository.rowmapper;

import io.github.olteanra.library.domain.User;
import io.github.olteanra.library.domain.builder.UserBuilder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Rares Oltean
 */
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new UserBuilder()
                .fullName(resultSet.getString("fullname"))
                .username(resultSet.getString("username"))
                .password(resultSet.getString("password"))
                .build();
    }

}
