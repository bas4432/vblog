package com.cos.vblog.comm;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BlogController {

    @GetMapping("/hello")
    public String hello(Model model){

        return "Test";
    }
}
