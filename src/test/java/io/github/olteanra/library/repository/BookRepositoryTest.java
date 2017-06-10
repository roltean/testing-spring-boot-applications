package io.github.olteanra.library.repository;

import io.github.olteanra.library.domain.Book;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Rares Oltean
 */
@EnableAutoConfiguration
public class BookRepositoryTest extends AbstractRepositoryTest {

    private BookRepository bookRepository;

    @Before
    public void setup() {
        bookRepository = new BookRepository(jdbcTemplate);
    }

    @Test
    public void testGetBooks() {
        List<Book> books = bookRepository.getBooks();
        assertThat(books).isNotEmpty().hasSize(7);
    }

}
