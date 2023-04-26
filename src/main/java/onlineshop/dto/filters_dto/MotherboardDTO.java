package onlineshop.dto.filters_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onlineshop.dto.ProductFilterDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MotherboardDTO extends ProductFilterDTO {
	private String socket;
	private String chipset;
	private int ram_max;
	private String form;
}
