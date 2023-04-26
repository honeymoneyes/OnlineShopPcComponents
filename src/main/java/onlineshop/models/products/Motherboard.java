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
@Table(name = "Motherboard")
public class Motherboard extends ProductAbstractEntity {
	@Transient
	private String name = "motherboard";
	@Column(name = "socket")
	private String socket; // CPU socket
	@Column(name = "chipset")
	private String chipset; // Chipset
	@Column(name = "ram")
	private int ram; // Max RAM
	@Column(name = "form")
	private String form; // Form-factor motherboard *** ATX *** MicroATX *** MiniATX ***
}
