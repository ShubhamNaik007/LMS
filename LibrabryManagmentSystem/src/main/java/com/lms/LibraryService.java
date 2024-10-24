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
}
