package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Motherboard")
public class Motherboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image")
    private String image; // Image
    @Column(name = "title")
    private String title; // Title
    @Column(name = "socket")
    private String socket; // CPU socket
    @Column(name = "chipset")
    private String chipset; // Chipset
    @Column(name = "ram")
    private int ram; // Max RAM
    @Column(name = "form")
    private String form; // Form-factor motherboard *** ATX *** MicroATX *** MiniATX ***
}
