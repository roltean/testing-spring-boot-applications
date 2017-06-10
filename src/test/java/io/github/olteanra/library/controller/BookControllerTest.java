package io.github.olteanra.library.controller;

import io.github.olteanra.library.domain.Book;
import io.github.olteanra.library.rest.controller.BookController;
import io.github.olteanra.library.service.BookService;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Rares Oltean
 */
@WebMvcTest(controllers = BookController.class)
public class BookControllerTest extends AbstractControllerTest {

    @MockBean
    private BookService bookService;

    @Test
    public void testGetAll() throws Exception {
        given(bookService.getBooks())
                .willReturn(Collections.singletonList(new Book("12345", "Title", "Author", 100, "Fiction")));

        mockMvc.perform(get("/books"))
                .andExpect(status().isOk());
    }

}
