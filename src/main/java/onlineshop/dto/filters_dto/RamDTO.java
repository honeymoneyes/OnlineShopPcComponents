package onlineshop.dto.filters_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onlineshop.dto.ProductFilterDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RamDTO extends ProductFilterDTO {
	private String ddr;
	private String capacity;
	private int frequency_min;
	private int frequency_max;
}
