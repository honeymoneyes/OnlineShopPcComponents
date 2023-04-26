package onlineshop.dto.filters_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onlineshop.dto.ProductFilterDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpuDTO extends ProductFilterDTO {
	private String socket;
	private String model;
	private int core_min;
	private int core_max;
	private double frequency_min;
	private double frequency_max;
	private int tdp_min;
	private int tdp_max;
}
