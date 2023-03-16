package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphicCard {
    private int id;
    private String image; // Image
    private String title; // Title graphic card
    private int model; // Model without GTX & RTX
    private int frequency; // Frequency graphic card
    private int memory; // Memory graphic card
}
