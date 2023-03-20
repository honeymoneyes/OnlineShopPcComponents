package onlineshop.repositories;

import onlineshop.models.DiskDrive;
import onlineshop.models.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard, Integer> {
    Optional<Motherboard> findById(int id);
}
