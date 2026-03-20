package com.example.BookstoreApplication.Service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailService
{
    @Async
    public void sendEmail(String bookName)
    {
        System.out.println("order confirmed for book: "+ bookName);
    }
}
