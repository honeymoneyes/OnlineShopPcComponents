package onlineshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductFilterDTO {
	private String brand;
	private String model;
	private double min_price;
	private double max_price;
}
