package onlineshop.models.products;

import lombok.*;
import onlineshop.models.ProductAbstractEntity;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "casepc")
public class CasePC extends ProductAbstractEntity {
	@Transient
	private String name = "case_pc";
	@Column(name = "form")
	private String form; // Product Form factor
	@Column(name = "coolers")
	private int coolers; // Number of coolers
}
