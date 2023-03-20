package onlineshop.repositories;

import onlineshop.models.PowerPC;
import onlineshop.models.RAM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RAMRepository extends JpaRepository<RAM, Integer> {
    Optional<RAM> findById(int id);
}
