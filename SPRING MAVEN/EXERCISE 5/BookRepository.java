package com.library.repository;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {

    public void saveBook() {
        System.out.println("Book Repository: Book saved successfully.");
    }
}