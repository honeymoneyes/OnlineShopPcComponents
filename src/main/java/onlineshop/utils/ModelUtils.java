package onlineshop.utils;

import onlineshop.models.products.CPU;
import onlineshop.services.CommonService;
import org.springframework.stereotype.Component;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import javax.swing.text.html.Option;
import java.util.Optional;

@Component
public class ModelUtils implements ModelUtilsInterface {

	@Override
	public Model createModel(CommonService productService) {
		Model model = new ExtendedModelMap();
		model.addAttribute("component", productService.show());
		return model;
	}

	@Override
	public Model createModelWithPhoto(CommonService productService, int widthPhoto, int heightPhoto) {
		Model model = new ExtendedModelMap();
		model.addAttribute("component", productService.show());
		model.addAttribute("width", widthPhoto);
		model.addAttribute("height", heightPhoto);
		return model;
	}

	@Override
	public Model createModelWithId(CommonService productService, int id) {
		Model model = new ExtendedModelMap();
		Optional<?> product = productService.find(id);
		product.ifPresent(value -> model.addAttribute("product", value));
		return model;
	}
}
