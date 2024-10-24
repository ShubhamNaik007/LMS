package com.lms;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LibraryServiceTest {

    @InjectMocks
    LibraryService service;

    @BeforeEach
    void setUp(){
        service = new LibraryService();
    }
}
