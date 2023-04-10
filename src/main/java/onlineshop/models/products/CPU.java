package onlineshop.models.products;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import onlineshop.models.ProductAbstractEntity;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cpu")
public class CPU extends ProductAbstractEntity {
    @Transient
    private String name = "cpu";
    @Column(name = "socket")
    private String socket; // CPU socket
    @Column(name = "model")
    private String model; // Processor number
    @Column(name = "core")
    private int core; // Total cores
    @Column(name = "frequency")
    private String frequency; // Frequency
    @Column(name = "frequency_max")
    private String frequency_max; // Frequency
    @Column(name = "tdp")
    private String TDP; // TDP processor
    @Column(name = "tdp_max")
    private String TDP_MAX; // TDP processor
}
