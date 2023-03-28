package onlineshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("")
public class TestController {
    @GetMapping("")
    public String main() {
        return "views/main";
    }
    @GetMapping("/basket")
    public String basket() {
        return "views/basket";
    }
}
