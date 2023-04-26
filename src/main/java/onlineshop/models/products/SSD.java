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
@Table(name = "ssd")
public class SSD extends ProductAbstractEntity {
	@Transient
	private String name = "ssd";
	@Column(name = "capacity")
	private int capacity; // Capacity disk drive
}

