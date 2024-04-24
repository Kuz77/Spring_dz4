package com.example.spring_dz_4;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("/greetings")
    public String hello(Model model){
        model.addAttribute("message", "1111111111");
        return "hello";
    }


}
