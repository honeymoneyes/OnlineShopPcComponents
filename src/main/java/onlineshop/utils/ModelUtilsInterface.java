package onlineshop.utils;

import onlineshop.services.CommonService;
import org.springframework.ui.Model;

public interface ModelUtilsInterface {
	Model createModelForAllFields(CommonService productService, String page);

	Model createModelWithId(CommonService productService, int id);

	Model createModelWithPhoto(CommonService productService, int widthPhoto, int heightPhoto);
}
