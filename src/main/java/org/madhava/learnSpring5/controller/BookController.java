package org.madhava.learnSpring5.controller;

import org.madhava.learnSpring5.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class BookController {

    private final BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public String getBook(Model model) {
        model.addAttribute("books",bookRepo.findAll());
        return "books/list";
    }
}
