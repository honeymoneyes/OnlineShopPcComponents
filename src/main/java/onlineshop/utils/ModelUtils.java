package onlineshop.utils;

import onlineshop.services.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.persistence.Column;

@Component
public class ModelUtils {

    public void createModelForProductsAndTheirPhotos(Model model, ProductService product, int widthPhoto, int heightPhoto) {
        model.addAttribute("cases", product.show());
        model.addAttribute("width", widthPhoto);
        model.addAttribute("height", heightPhoto);
    }
}
