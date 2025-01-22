package com.modelClass;

public class Book {
    // Fields
    private String title;
    private String author;
    private int numberofpages;

    // Constructor
    public Book(String title, String author, int numberofpages) {
        this.title = title;
        this.author = author;
        this.numberofpages = numberofpages;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for numberofpages
    public int getNumberofpages() {
        return numberofpages;
    }
}
