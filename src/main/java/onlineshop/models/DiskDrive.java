package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiskDrive {
    private int id;
    private String image; // Image
    private String title; // Title
    private String type; // Type disk drive - SSD or HDD or m2.Nvme
    private int capacity; // Capacity disk drive
}