package com.example.DemoApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//====================================================
// Controller Class
//====================================================
@RestController
public class Controller {
    @RequestMapping("/top")
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("/second")
    public String goodby() {
        return "Good by World!";
    }
}
