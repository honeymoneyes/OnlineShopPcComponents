package onlineshop.models.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import onlineshop.models.ProductAbstractEntity;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "graphiccard")
public class GraphicCard extends ProductAbstractEntity {
    @Column(name = "model")
    private String model; // Model with GTX & RTX
    @Column(name = "frequency")
    private String frequency; // Frequency graphic card
    @Column(name = "memory")
    private String memory; // Memory graphic card
}
