package onlineshop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class ProductAbstractEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "image")
	String image;
	@Column(name = "title")
	String title;
	@Column(name = "brand")
	String brand;
	@Column(name = "model")
	String model;
	@Column(name = "price")
	private String price;
}
