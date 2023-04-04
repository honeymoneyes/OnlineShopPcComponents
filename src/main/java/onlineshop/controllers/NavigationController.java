package onlineshop.controllers;

import lombok.RequiredArgsConstructor;
import onlineshop.utils.PageNameValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class NavigationController {
    public final PageNameValidator pageNameValidator;

    @GetMapping("")
    public String test(Model model) {
        return "views/main";
    }

    @GetMapping("/{page}")
    public String goToPage(@PathVariable("page") String page, Model model) {
        pageNameValidator.processPageRequest(page, model);
        return "views/template";
    }

    @GetMapping("/basket")
    public String basket() {
        return "views/basket";
    }
}
