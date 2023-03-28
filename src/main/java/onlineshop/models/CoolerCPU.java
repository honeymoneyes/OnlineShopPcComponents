package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.nio.file.Path;

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
    private String image; // Image
    @Column(name = "title")
    private String title; // Title cooler
    @Column(name = "TDP")
    private int TDP; // TDP cooler
}
