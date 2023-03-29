package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "casepc")
public class CasePC {
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
    @Column(name = "form")
    private String form; // Product Form factor
    @Column(name = "coolers")
    private int coolers; // Number of coolers
}
