package onlineshop.repositories;

import onlineshop.models.Motherboard;
import onlineshop.models.PowerPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PowerPCRepository extends JpaRepository<PowerPC,Integer> {
    Optional<PowerPC> findById(int id);
}
