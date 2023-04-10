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
@Table(name = "hdd")
public class HDD extends ProductAbstractEntity {
    @Transient
    private String name = "hdd";
    @Column(name = "capacity")
    private String capacity; // Capacity disk drive
}