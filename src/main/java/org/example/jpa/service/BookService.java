package org.example.jpa.service;

import lombok.RequiredArgsConstructor;
import org.example.jpa.entity.Book;
import org.example.jpa.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository; // hibernate로 된 구현체를 이후 사용하므로 interface만 알아도 된다

    public void addBook(Book book) {
        Book newBook = bookRepository.save(book);
        System.out.println("newBook = " + newBook);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
