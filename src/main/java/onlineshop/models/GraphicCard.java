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
    private String image; // Image
    @Column(name = "title")
    private String title; // Title graphic card
    @Column(name = "model")
    private String model; // Model with GTX & RTX
    @Column(name = "frequency")
    private int frequency; // Frequency graphic card
    @Column(name = "memory")
    private int memory; // Memory graphic card
}
