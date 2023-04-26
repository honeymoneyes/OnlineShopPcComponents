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
		return modelUtils.createModelForAllFields(productService, page);
	}

	public Model processPageRequest(String page, int id) {
		CommonService productService = pageNameValidator.compareStringInput(page);
		return modelUtils.createModelWithId(productService, id);
	}
}
