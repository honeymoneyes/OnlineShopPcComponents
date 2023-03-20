package onlineshop.repositories;

import onlineshop.models.CasePC;
import onlineshop.models.CoolerCPU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoolerCPURepository extends JpaRepository<CoolerCPU, Integer> {
    Optional<CoolerCPU> findById(int id);
}
