package com.example.spring_dz_4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm(){
        return "form";
    }

    @PostMapping("/form")
    public String processForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "result";
    }

}
