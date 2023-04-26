package onlineshop.models.products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onlineshop.models.ProductAbstractEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "graphiccard")
public class GraphicCard extends ProductAbstractEntity {
	@Transient
	private String name = "graphic_card";
	@Column(name = "family")
	private String family; // Model with GTX & RTX
	@Column(name = "frequency")
	private int frequency; // Frequency graphic card
	@Column(name = "memory")
	private int memory; // Memory graphic card
}
