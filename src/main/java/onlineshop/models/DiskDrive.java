package onlineshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DiskDrive")
public class DiskDrive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image")
    private String image; // Image
    @Column(name = "title")
    private String title; // Title
    @Column(name = "type")
    private String type; // Type disk drive - SSD or HDD or m2.Nvme
    @Column(name = "capacity")
    private int capacity; // Capacity disk drive
}