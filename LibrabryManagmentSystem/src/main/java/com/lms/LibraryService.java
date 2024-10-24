package com.lms;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LibraryService {

    private final Map<String,Book> bookStorage = new HashMap<>();
}
