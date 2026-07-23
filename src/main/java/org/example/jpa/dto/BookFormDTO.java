package org.example.jpa.dto;

import org.example.jpa.entity.Book;

public record BookFormDTO(String title, String author) {
    public Book toEntity() {
        return Book.builder()
                .title(title)
                .author(author)
                .build();
    }
}
