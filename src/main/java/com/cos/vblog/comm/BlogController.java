package com.cos.vblog.comm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>blogTest<h1>";
    }
}
