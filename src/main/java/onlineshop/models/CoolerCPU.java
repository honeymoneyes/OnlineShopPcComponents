package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.Path;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoolerCPU {
    private int id;
    private String image; // Image
    private String title; // Title cooler
    private int TDP; // TDP cooler
}
