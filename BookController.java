package com.example.BookstoreApplication.Controller;

import com.example.BookstoreApplication.Service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController
{

    private final BookService bookService;
    private final String welcomeUser;

    public BookController(BookService bookService, String welcomeUser)
    {
        this.bookService = bookService;
        this.welcomeUser = welcomeUser;
    }

    @GetMapping("/welcome")
    public String showWelcome()
    {
        return welcomeUser;
    }
    @GetMapping()
    public String listBooks()
    {
        return bookService.fetchAllBooks();
    }

    @PostMapping("/order")
    public String orderBook(@RequestParam String bookName)
    {
        return bookService.orderBook(bookName);
    }
}
