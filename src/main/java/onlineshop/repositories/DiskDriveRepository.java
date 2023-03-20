package onlineshop.repositories;

import onlineshop.models.CPU;
import onlineshop.models.DiskDrive;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiskDriveRepository extends JpaRepository<DiskDrive, Integer> {
    Optional<DiskDrive> findById(int id);
}
