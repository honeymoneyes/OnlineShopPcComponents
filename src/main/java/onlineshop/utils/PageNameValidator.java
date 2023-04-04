package onlineshop.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import onlineshop.models.ProductNamesEnum;
import onlineshop.models.products.*;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.*;

@Component
@RequiredArgsConstructor
public class PageNameValidator {
    public final ModelUtils modelUtils;
    public final ProductService<CPU> cpuProductService;
    public final ProductService<Motherboard> motherboardProductService;
    public final ProductService<GraphicCard> graphicCardProductService;
    public final ProductService<RAM> ramProductService;
    public final ProductService<PowerPC> powerPCProductService;
    public final ProductService<CasePC> casePCProductService;
    public final ProductService<DiskDrive> diskDriveProductService;
    public final ProductService<SSD> ssdProductService;


    public void processPageRequest(String page, Model model) {
        ProductService productService = compareStringInput(page, model);
        modelUtils.createModelForProductsAndTheirPhotos(model, productService, 120, 110);
    }


    public ProductService compareStringInput(String page, Model model) {
        EnumMap<ProductNamesEnum, ProductService<?>> productServiceMap = new EnumMap<>(ProductNamesEnum.class);
        productServiceMap.put(ProductNamesEnum.cpu, cpuProductService);
        productServiceMap.put(ProductNamesEnum.motherboard, motherboardProductService);
        productServiceMap.put(ProductNamesEnum.graphic_card, graphicCardProductService);
        productServiceMap.put(ProductNamesEnum.ram, ramProductService);
        productServiceMap.put(ProductNamesEnum.power_pc, powerPCProductService);
        productServiceMap.put(ProductNamesEnum.case_pc, casePCProductService);
        productServiceMap.put(ProductNamesEnum.hdd, diskDriveProductService);
        productServiceMap.put(ProductNamesEnum.ssd, ssdProductService);

        return Optional
                .ofNullable(productServiceMap.get(ProductNamesEnum.valueOf(page)))
                .orElseThrow(() -> new RuntimeException("Invalid link"));
    }
}
