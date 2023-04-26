package onlineshop.dto.filters_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onlineshop.dto.ProductFilterDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasePcDTO extends ProductFilterDTO {
	private String form;
	private int coolers_min;
	private int coolers_max;
}
