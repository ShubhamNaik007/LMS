package com.lms;

public class Book {
    private String number;
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String number, String title, String author, boolean borrowed) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
