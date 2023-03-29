package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RAM")
public class RAM {
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
    @Column(name = "ddr")
    private int ddr; // DDR RAM - 2 - 3 - 4 - 5
    @Column(name = "capacity")
    private int capacity; // Capacity RAM - 2 / 4 / 8 / etc.
    @Column(name = "frequency")
    private int frequency; // Frequency RAM - 1333 / 1600 / 1866 / etc.
}
