package org.madhava.learnSpring5.controller;

import org.madhava.learnSpring5.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @RequestMapping("/books")
    public String getBook(Model model) {
        model.addAttribute("books",bookRepo.findAll());
        return "books/list";
    }
}
