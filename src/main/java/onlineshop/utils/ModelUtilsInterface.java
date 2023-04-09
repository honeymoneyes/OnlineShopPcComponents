package onlineshop.utils;

import onlineshop.services.CommonService;
import org.springframework.ui.Model;

public interface ModelUtilsInterface {
	public Model createModel(CommonService product);

	public Model createModel(CommonService product, int widthPhoto, int heightPhoto);
}
