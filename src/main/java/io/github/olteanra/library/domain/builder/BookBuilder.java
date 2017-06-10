package io.github.olteanra.library.domain.builder;

import io.github.olteanra.library.domain.Book;

/**
 * @author Rares Oltean
 */
public final class BookBuilder {
    private String isbn;
    private String title;
    private String author;
    private int pages;
    private String genre;

    public BookBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder pages(int pages) {
        this.pages = pages;
        return this;
    }

    public BookBuilder genre(String genre) {
        this.genre = genre;
        return this;
    }

    public Book build() {
        Book book = new Book(isbn, title, author, pages, genre);
        return book;
    }
}
