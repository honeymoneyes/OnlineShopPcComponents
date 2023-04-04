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
@Table(name = "RAM")
public class RAM extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ddr")
    private int ddr; // DDR RAM - 2 - 3 - 4 - 5
    @Column(name = "capacity")
    private int capacity; // Capacity RAM - 2 / 4 / 8 / etc.
    @Column(name = "frequency")
    private int frequency; // Frequency RAM - 1333 / 1600 / 1866 / etc.
}
