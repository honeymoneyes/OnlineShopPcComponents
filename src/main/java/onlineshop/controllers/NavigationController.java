package onlineshop.controllers;

import lombok.RequiredArgsConstructor;
import onlineshop.utils.ModelUtils;
import onlineshop.utils.PageNameValidator;
import onlineshop.utils.PageRequestProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping()
@RequiredArgsConstructor
public class NavigationController {
	public final PageNameValidator pageNameValidator;
	public final ModelUtils modelUtils;
	public final PageRequestProcessor pageRequestProcessor;

	@GetMapping("favicon.ico")
	@ResponseBody
	void returnNoFavicon() {
	}
	@GetMapping()
	public String main() {
		return "views/main";
	}

	@GetMapping("/{page}/{id}")
	public String goToDescription(@PathVariable("page") String page, @PathVariable("id") int id, Model model) {
		Model modelForProduct = pageRequestProcessor.processPageRequest(page, id);
		model.addAllAttributes(modelForProduct.asMap());
		return "views/description";
	}

	@GetMapping("/{page}")
	public String goToPage(@PathVariable("page") String page, Model model) {
		Model modelForProducts = pageRequestProcessor.processPageRequest(page);
		model.addAllAttributes(modelForProducts.asMap());
		return "views/template";
	}
}
