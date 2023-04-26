package onlineshop.models.products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import onlineshop.models.ProductAbstractEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "RAM")
public class RAM extends ProductAbstractEntity {
	@Transient
	private String name = "ram";
	@Column(name = "ddr")
	private String ddr; // DDR RAM - 2 - 3 - 4 - 5
	@Column(name = "capacity")
	private String capacity; // Capacity RAM - 2 / 4 / 8 / etc.
	@Column(name = "frequency")
	private int frequency; // Frequency RAM - 1333 / 1600 / 1866 / etc.
}
