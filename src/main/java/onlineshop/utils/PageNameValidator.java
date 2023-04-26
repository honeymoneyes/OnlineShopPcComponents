package onlineshop.utils;

import lombok.RequiredArgsConstructor;
import onlineshop.dto.ProductFilterDTO;
import onlineshop.dto.filters_dto.*;
import onlineshop.models.ProductNamesEnum;
import onlineshop.models.products.*;
import onlineshop.services.CommonService;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PageNameValidator {
	public final CommonService<CPU> cpuProductService;
	public final CommonService<Motherboard> motherboardProductService;
	public final CommonService<GraphicCard> graphicCardProductService;
	public final CommonService<RAM> ramProductService;
	public final CommonService<PowerPC> powerPCProductService;
	public final CommonService<CasePC> casePCProductService;
	public final CommonService<HDD> HDDProductService;
	public final CommonService<SSD> ssdProductService;


	public CommonService compareStringInput(String page) {
		EnumMap<ProductNamesEnum, CommonService<?>> productServiceMap = new EnumMap<>(ProductNamesEnum.class);
		productServiceMap.put(ProductNamesEnum.cpu, cpuProductService);
		productServiceMap.put(ProductNamesEnum.motherboard, motherboardProductService);
		productServiceMap.put(ProductNamesEnum.graphic_card, graphicCardProductService);
		productServiceMap.put(ProductNamesEnum.ram, ramProductService);
		productServiceMap.put(ProductNamesEnum.power_pc, powerPCProductService);
		productServiceMap.put(ProductNamesEnum.case_pc, casePCProductService);
		productServiceMap.put(ProductNamesEnum.hdd, HDDProductService);
		productServiceMap.put(ProductNamesEnum.ssd, ssdProductService);

		return Optional
				.ofNullable(productServiceMap.get(ProductNamesEnum.valueOf(page)))
				.orElseThrow(() -> new RuntimeException("Invalid link"));
	}

	public ProductFilterDTO addFilterFields(String page) {
		EnumMap<ProductNamesEnum, ProductFilterDTO> productFilterMap = new EnumMap<>(ProductNamesEnum.class);
		productFilterMap.put(ProductNamesEnum.cpu, new CpuDTO());
		productFilterMap.put(ProductNamesEnum.motherboard, new MotherboardDTO());
		productFilterMap.put(ProductNamesEnum.graphic_card, new GraphicCardDTO());
		productFilterMap.put(ProductNamesEnum.ram, new RamDTO());
		productFilterMap.put(ProductNamesEnum.power_pc, new PowerPcDTO());
		productFilterMap.put(ProductNamesEnum.case_pc, new CasePcDTO());
		productFilterMap.put(ProductNamesEnum.hdd, new HddDTO());
		productFilterMap.put(ProductNamesEnum.ssd, new SsdDTO());

		return Optional
				.ofNullable(productFilterMap.get(ProductNamesEnum.valueOf(page)))
				.orElseThrow(() -> new RuntimeException("Invalid link"));
	}
}
