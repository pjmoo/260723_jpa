package org.example.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.jpa.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MainController {
    private final BookService bookService;

    @GetMapping
    public String index() {
        return "index";
    }
}
