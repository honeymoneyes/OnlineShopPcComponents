package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Product {
    @Column(name = "image")
    String image;
    @Column(name = "title")
    String title;
    @Column(name = "subtitle")
    String subtitle;
    @Column(name = "price")
    private String price;
}
