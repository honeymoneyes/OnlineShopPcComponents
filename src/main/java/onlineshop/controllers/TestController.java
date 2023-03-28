package onlineshop.controllers;

import lombok.RequiredArgsConstructor;
import onlineshop.services.CasePCService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("")
@RequiredArgsConstructor
public class TestController {
    public final CasePCService casePCService;
    @GetMapping("")
    public String main(Model model) {
        model.addAttribute("cases", casePCService.showCasePCAll());
        return "views/main";
    }
    @GetMapping("/basket")
    public String basket() {
        return "views/basket";
    }
    @GetMapping("/test")
    public String test() {
        System.out.println(casePCService.showCasePCAll());
        return "views/test";
    }
}
