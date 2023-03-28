package onlineshop.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cpu")
public class CPU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image")
    private String image; // Image
    @Column(name = "title")
    private String title; // Title processor
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
