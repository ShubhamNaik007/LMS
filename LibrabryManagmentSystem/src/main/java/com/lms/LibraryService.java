package com.lms;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class LibraryService {

    private final Map<String,Book> bookStorage = new HashMap<>();

    public void addBook(Book book){
        this.bookStorage.put(book.getNumber(),book);
    }

    public Optional<Book> findBookByNumber(String number){
        return Optional.ofNullable(this.bookStorage.get(number));
    }

    public void borrowBook(String number){
        Optional<Book> optionalBook = findBookByNumber(number);
        if(optionalBook.isPresent()){
            Book book = optionalBook.get();
            if(!book.isBorrowed()){
                book.setBorrowed(true);
            }else {
                throw new IllegalArgumentException("Book is already borrowed");
            }
        }else {
            throw new IllegalArgumentException("Book not found");
        }
    }

    public void returnBook(String number){
        Optional<Book> optionalBook = findBookByNumber(number);
        if (optionalBook.isPresent()){
            Book book = optionalBook.get();
            if(book.isBorrowed()){
                book.setBorrowed(false);
            }else {
                throw new IllegalArgumentException("Book was not borrowed");
            }
        }else {
            throw new IllegalArgumentException("Book not found");
        }
    }
}
