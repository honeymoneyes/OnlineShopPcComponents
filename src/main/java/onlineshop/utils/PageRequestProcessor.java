package onlineshop.utils;

import lombok.RequiredArgsConstructor;
import onlineshop.services.CommonService;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
@RequiredArgsConstructor
public class PageRequestProcessor {
	public final PageNameValidator pageNameValidator;
	public final ModelUtils modelUtils;

	public Model processPageRequest(String page) {
		CommonService productService = pageNameValidator.compareStringInput(page);
		return modelUtils.createModel(productService, 120, 110);
	}
}
