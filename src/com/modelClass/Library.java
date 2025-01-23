package com.modelClass;
import java.util.ArrayList;
import java.util.List;

public class Library {
    public static class books {
        public class Book {
            private String title;
            private String author;

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public String getTitle() {
                return title;
            }

            public String getAuthor() {
                return author;
            }
        }
    }

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Method for adding the book
    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    // Method for removing a book using the title
    public boolean removeBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                books.remove(b);
                return true;
            }
        }
        return false;
    }

    // Method for searching the book using title
    public Book searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

}
