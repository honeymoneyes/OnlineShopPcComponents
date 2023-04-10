package onlineshop.utils;

import onlineshop.services.CommonService;
import org.springframework.ui.Model;

public interface ModelUtilsInterface {
	public Model createModel(CommonService productService);
	public Model createModelWithId(CommonService productService, int id);
	public Model createModelWithPhoto(CommonService productService, int widthPhoto, int heightPhoto);
}
