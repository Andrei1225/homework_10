package ru.skypro;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorBook;
    private int publishingYear;

    public Book(String bookName, String authorBook, int publishingYear) {
        this.bookName = bookName;
        this.authorBook = authorBook;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorBook(){
        return authorBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear &&
                bookName.equals(book.bookName) &&
                authorBook.equals(book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorBook, publishingYear);
    }

    @Override
    public String toString() {
        return bookName + ", " + authorBook + ", " + publishingYear + "г. ";
    }
}
