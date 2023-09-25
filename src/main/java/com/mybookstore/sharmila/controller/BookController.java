package com.mybookstore.sharmila.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @GetMapping
    public String saveBook(){
        return "saveBook";

    }

}
