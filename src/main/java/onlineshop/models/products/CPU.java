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
@Table(name = "cpu")
public class CPU extends ProductAbstractEntity {
	@Transient
	private String name = "cpu";
	@Column(name = "socket")
	private String socket; // CPU socket
	@Column(name = "family")
	private String model; // Processor family
	@Column(name = "core")
	private int core; // Total cores
	@Column(name = "frequency")
	private double frequency; // Frequency
	@Column(name = "frequency_max")
	private double frequency_max; // Frequency
	@Column(name = "tdp")
	private int TDP; // TDP processor
	@Column(name = "tdp_max")
	private int TDP_MAX; // TDP processor
}
