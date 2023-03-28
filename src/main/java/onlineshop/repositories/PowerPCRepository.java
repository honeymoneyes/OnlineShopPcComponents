package onlineshop.repositories;

import onlineshop.models.PowerPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerPCRepository extends JpaRepository<PowerPC,Integer> {
}
