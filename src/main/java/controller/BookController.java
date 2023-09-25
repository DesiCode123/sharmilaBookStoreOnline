package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class BookController {

    @GetMapping("/api/book")
    public String saveBook(){
        return "saveBook";

    }

}
