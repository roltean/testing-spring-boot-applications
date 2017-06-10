package io.github.olteanra.library.repository;

import io.github.olteanra.library.domain.Book;
import io.github.olteanra.library.repository.rowmapper.BookRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rares Oltean
 */
@Repository
public class BookRepository {

    private JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBooks() {
        final String GET_ALL_QUERY = "SELECT * FROM Books";
        return jdbcTemplate.query(GET_ALL_QUERY, new BookRowMapper());
    }

}
