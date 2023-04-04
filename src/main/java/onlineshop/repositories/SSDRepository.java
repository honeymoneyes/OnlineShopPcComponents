package onlineshop.repositories;

import onlineshop.models.products.SSD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SSDRepository extends JpaRepository<SSD, Integer> {
}
