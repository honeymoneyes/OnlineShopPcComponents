package onlineshop.utils;

import lombok.RequiredArgsConstructor;
import onlineshop.services.CommonService;
import onlineshop.services.product_services.*;
import org.springframework.stereotype.Component;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ModelUtils implements ModelUtilsInterface {
	public final PageNameValidator pageNameValidator;

	@Override
	public Model createModelForAllFields(CommonService productService, String page) {
		Model model = new ExtendedModelMap();
		model.addAttribute("component", productService.show());
		model.addAttribute("brands", productService.showUniqueBrand());
		model.addAttribute("minPrice", productService.showUniqueFloorPrices());
		model.addAttribute("maxPrice", productService.showUniqueCeilPrices());
		model.addAttribute("width", 120);
		model.addAttribute("height", 110);
		switch (page) {
			case "cpu" -> {
				model.addAttribute("sockets", ((CPUService) productService).showUniqueSocket());
				model.addAttribute("families", ((CPUService) productService).showUniqueFamily());
				model.addAttribute("cores", ((CPUService) productService).showUniqueCore());
				model.addAttribute("frequencies", ((CPUService) productService).showUniqueFrequency());
				model.addAttribute("tdps", ((CPUService) productService).showUniqueTdp());
			}
			case "motherboard" -> {
				model.addAttribute("sockets", ((MotherboardService) productService).showUniqueSocket());
				model.addAttribute("chipsets", ((MotherboardService) productService).showUniqueChipset());
				model.addAttribute("rams", ((MotherboardService) productService).showUniqueRam());
				model.addAttribute("forms", ((MotherboardService) productService).showUniqueForm());
			}
			case "graphic_card" -> {
				model.addAttribute("families", ((GraphicCardService) productService).showUniqueFamily());
				model.addAttribute("frequencies", ((GraphicCardService) productService).showUniqueFrequency());
				model.addAttribute("memories", ((GraphicCardService) productService).showUniqueMemory());
			}
			case "ram" -> {
				model.addAttribute("ddrs", ((RAMService) productService).showUniqueDdr());
				model.addAttribute("capacities", ((RAMService) productService).showUniqueCapacity());
				model.addAttribute("frequencies", ((RAMService) productService).showUniqueFrequency());
			}
			case "power_pc" -> model.addAttribute("powers", ((PowerPCService) productService).showUniquePower());
			case "case_pc" -> {
				model.addAttribute("forms", ((CasePCService) productService).showForm());
				model.addAttribute("coolers", ((CasePCService) productService).showCoolers());
			}
			case "hdd" -> model.addAttribute("capacities", ((HDDService) productService).showUniqueCapacity());
			case "ssd" -> model.addAttribute("capacities", ((SSDService) productService).showUniqueCapacity());
		}
		return model;
	}

	@Override
	public Model createModelWithId(CommonService productService, int id) {
		Model model = new ExtendedModelMap();
		Optional<?> product = productService.find(id);
		product.ifPresent(value -> model.addAttribute("product", value));
		return model;
	}

	@Override
	public Model createModelWithPhoto(CommonService productService, int widthPhoto, int heightPhoto) {
		return null;
	}
}
