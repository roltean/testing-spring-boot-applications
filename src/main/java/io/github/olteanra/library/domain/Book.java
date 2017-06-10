package io.github.olteanra.library.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Rares Oltean
 */
public class Book {

    private String isbn;
    private String title;
    private String author;
    private int pages;
    private String genre;

    @JsonCreator
    public Book(String isbn, String title, String author, int pages, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }
}
