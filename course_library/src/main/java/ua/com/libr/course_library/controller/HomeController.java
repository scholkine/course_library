package ua.com.shop_course_371.shop_course_371.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getPageHome(Model model){
        model.addAttribute("hello","Hello world!");
        return "home";
    }
}