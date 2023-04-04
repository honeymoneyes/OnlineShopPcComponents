package onlineshop.repositories;

import onlineshop.models.products.PowerPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerPCRepository extends JpaRepository<PowerPC, Integer> {
}
