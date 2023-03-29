package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GraphicCard")
public class GraphicCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image")
    private String image; // Product Photo
    @Column(name = "title")
    private String title; // Component Name
    @Column(name = "subtitle")
    private String subtitle; // Product Name
    @Column(name = "price")
    private String price; // Product Price
    @Column(name = "model")
    private String model; // Model with GTX & RTX
    @Column(name = "frequency")
    private int frequency; // Frequency graphic card
    @Column(name = "memory")
    private int memory; // Memory graphic card
}
