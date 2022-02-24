package com.phoenix;

public class Book {
    private String Author;
    private String Name;

    Book(String author, String nameBook) {
        Author = author;
        Name = nameBook;
    }

    public String getName() {
        return Name;
    }
}
