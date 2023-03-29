package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coolercpu")
public class CoolerCPU {
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
    @Column(name = "TDP")
    private int TDP; // TDP cooler
}
