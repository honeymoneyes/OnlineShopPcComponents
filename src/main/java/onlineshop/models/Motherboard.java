package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Motherboard {
    private int id;
    private String image; // Image
    private String title; // Title
    private String socket; // CPU socket
    private String chipset; // Chipset
    private int ram; // Max RAM
    private String form; // Form-factor motherboard *** ATX *** MicroATX *** MiniATX ***
}
