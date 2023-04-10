package onlineshop.utils;

import lombok.RequiredArgsConstructor;
import onlineshop.models.ProductNamesEnum;
import onlineshop.models.products.*;
import onlineshop.services.CommonService;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@RequiredArgsConstructor
public class PageNameValidator {
    public final ModelUtils modelUtils;
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
}
