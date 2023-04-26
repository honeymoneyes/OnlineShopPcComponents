package onlineshop.controllers;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.CPU;
import onlineshop.services.CommonService;
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
	public final CommonService<CPU> cpuCommonService;
	public final PageRequestProcessor pageRequestProcessor;

	@GetMapping("favicon.ico")
	@ResponseBody
	void returnNoFavicon() {
	}

	@GetMapping()
	public String main() {
		return "views/main";
	}

	@GetMapping("/test")
	public void test() {
		cpuCommonService.showUniqueBrand().forEach(System.out::println);
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
		model.addAttribute("search", "");
		return "views/template";
	}
}
