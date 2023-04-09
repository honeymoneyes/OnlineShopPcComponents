package onlineshop.utils;

import onlineshop.services.CommonService;
import org.springframework.stereotype.Component;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

@Component
public class ModelUtils implements ModelUtilsInterface {

	@Override
	public Model createModel(CommonService product) {
		Model model = new ExtendedModelMap();
		model.addAttribute("component", product.show());
		return model;
	}

	@Override
	public Model createModel(CommonService product, int widthPhoto, int heightPhoto) {
		Model model = new ExtendedModelMap();
		model.addAttribute("component", product.show());
		model.addAttribute("width", widthPhoto);
		model.addAttribute("height", heightPhoto);
		return model;
	}
}
