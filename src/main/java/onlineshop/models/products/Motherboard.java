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
@Table(name = "Motherboard")
public class Motherboard extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "socket")
    private String socket; // CPU socket
    @Column(name = "chipset")
    private String chipset; // Chipset
    @Column(name = "ram")
    private int ram; // Max RAM
    @Column(name = "form")
    private String form; // Form-factor motherboard *** ATX *** MicroATX *** MiniATX ***
}
