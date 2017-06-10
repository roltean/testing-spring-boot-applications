package io.github.olteanra.library.service;

import io.github.olteanra.library.domain.Book;
import io.github.olteanra.library.repository.BookRepository;
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
public class BookServiceTest {

    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Before
    public void setup() {
        initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testGetAll() {
        given(bookRepository.getBooks()).willReturn(Collections.singletonList(new Book("12345", "Title", "Author", 100, "Fiction")));

        List<Book> books = bookService.getBooks();
        assertThat(books).isNotEmpty().hasSize(1);
    }

}
