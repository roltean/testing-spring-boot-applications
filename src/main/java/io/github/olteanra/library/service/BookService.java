package io.github.olteanra.library.service;

import io.github.olteanra.library.domain.Book;
import io.github.olteanra.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rares Oltean
 */
@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }
}
