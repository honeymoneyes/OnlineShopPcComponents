package onlineshop.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CPU {
    private int id;
    private String image; // Image
    private String title; // Title processor
    private String socket; // CPU socket
    private int model; // Processor number
    private int core; // Total cores
    private int frequency; // Frequency
    private int TDP; // TDP processor
}
