package onlineshop.dto.filters_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onlineshop.dto.ProductFilterDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HddDTO extends ProductFilterDTO {
	private int capacity_min;
	private int capacity_max;
}
