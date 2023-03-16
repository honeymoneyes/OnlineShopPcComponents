package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PowerPC {
    private int id;
    private String image; // Image
    private String title; // Title
    private int power; // Power
}
