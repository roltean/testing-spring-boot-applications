package io.github.olteanra.library.repository.rowmapper;

import io.github.olteanra.library.domain.Book;
import io.github.olteanra.library.domain.builder.BookBuilder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Rares Oltean
 */
public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new BookBuilder()
                .author(resultSet.getString("author"))
                .title(resultSet.getString("title"))
                .isbn(resultSet.getString("isbn"))
                .genre(resultSet.getString("genre"))
                .pages(resultSet.getInt("pages"))
                .build();
    }

}
