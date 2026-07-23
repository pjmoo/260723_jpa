package org.example.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.jpa.dto.BookFormDTO;
import org.example.jpa.entity.Book;
import org.example.jpa.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MainController {
    private final BookService bookService;

    @GetMapping
//    public String index() {
    public String index(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "index";
    }

    @PostMapping
//    public String addBook(@ModelAttribute Book book) {
    public String addBook(@ModelAttribute BookFormDTO dto) {
        bookService.addBook(dto.toEntity());
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id); // 없는 id를 주면 throw
        model.addAttribute("book", book);
        return "detail";
    }

    @PostMapping("/{id}")
    public String updateBook(
            @PathVariable Long id,
            @ModelAttribute BookFormDTO dto) {
        bookService.updateBook(Book.builder()
                .id(id)
                .title(dto.title())
                .author(dto.author())
                .build());
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/";
    }
}
