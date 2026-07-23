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
        return bookRepository.findAll(); // 리스트
    }

    public Book getBookById(Long id) {
        // Optional
        return bookRepository.findById(id)
                // .get(); // 없으면 null인 상태로 가져옴
                .orElseThrow(); // null이면 throw해버리세요 (NoSuchElementException)
        // DB 조회할 때 '존재하지 않을 가능성'
        // JPA -> Optional<Entity>
        // Null 처리에 대한 옵션을 준다
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
        // 1. id가 비어있음 -> 새로운 영속성 컨텍스트의 entity를 만들어서 신규 insert
        // 2. id가 있음 -> 기존의 영속성 컨텍스트의 entity를 찾아서 update
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
