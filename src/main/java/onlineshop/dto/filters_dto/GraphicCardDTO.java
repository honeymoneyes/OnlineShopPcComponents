package onlineshop.dto.filters_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onlineshop.dto.ProductFilterDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraphicCardDTO extends ProductFilterDTO {
	private String model;
	private int frequency_min;
	private int frequency_max;
	private int memory_min;
	private int memory_max;
}
