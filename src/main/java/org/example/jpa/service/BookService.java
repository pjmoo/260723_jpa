package org.example.jpa.service;

import lombok.RequiredArgsConstructor;
import org.example.jpa.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository; // hibernate로 된 구현체를 이후 사용하므로 interface만 알아도 된다
}
