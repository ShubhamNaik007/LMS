package com.lms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LibraryServiceTest {

    @InjectMocks
    LibraryService service;

    @BeforeEach
    void setUp(){
        service = new LibraryService();
    }

    @Test
    void addBookToLibrary(){
        Book book = new Book("1","Java Fundamentals","Nageshwar rao");

        this.service.addBook(book);

        Optional<Book> fetchBook = service.findBookByNumber("1");
        assert(fetchBook.isPresent());
        assertEquals("Java Fundamentals",fetchBook.get().getTitle());
    }

    @Test
    void borrowBookFromLibrary(){
        Book book = new Book("2","C programming","Ajay Mittal");

        this.service.addBook(book);
        this.service.borrowBook("2");

        Optional<Book> fetchBook = service.findBookByNumber("2");
        assertTrue(fetchBook.isPresent());
        assertTrue(fetchBook.get().isBorrowed());
    }
}
