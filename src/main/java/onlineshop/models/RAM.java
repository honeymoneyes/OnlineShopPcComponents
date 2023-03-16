package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RAM {
    private int id;
    private String image; // Image
    private String title; // Title RAM
    private int ddr; // DDR RAM - 2 - 3 - 4 - 5
    private int capacity; // Capacity RAM - 2 / 4 / 8 / etc.
    private int frequency; // Frequency RAM - 1333 / 1600 / 1866 / etc.
}
