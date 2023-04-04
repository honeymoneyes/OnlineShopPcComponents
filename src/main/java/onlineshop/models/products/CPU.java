package onlineshop.models.products;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import onlineshop.models.Product;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cpu")
public class CPU extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "socket")
    private String socket; // CPU socket
    @Column(name = "model")
    private String model; // Processor number
    @Column(name = "core")
    private int core; // Total cores
    @Column(name = "frequency")
    private int frequency; // Frequency
    @Column(name = "TDP")
    private int TDP; // TDP processor
}
