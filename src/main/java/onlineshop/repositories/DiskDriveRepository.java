package onlineshop.repositories;

import onlineshop.models.DiskDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiskDriveRepository extends JpaRepository<DiskDrive, Integer> {
    Optional<DiskDrive> findById(int id);
}
