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
@Table(name = "casepc")
public class CasePC extends ProductAbstractEntity {
	@Transient
	private String name = "case_pc";
	@Column(name = "form")
	private String form; // Product Form factor
	@Column(name = "coolers")
	private int coolers; // Number of coolers
}
