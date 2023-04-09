package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @Column(name = "subtitle")
    String subtitle;
    @Column(name = "price")
    private String price;
}
