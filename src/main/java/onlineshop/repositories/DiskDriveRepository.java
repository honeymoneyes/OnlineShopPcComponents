package onlineshop.repositories;

import onlineshop.models.DiskDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiskDriveRepository extends JpaRepository<DiskDrive, Integer> {
}
