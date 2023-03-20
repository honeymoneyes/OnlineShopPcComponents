package onlineshop.repositories;

import onlineshop.models.CPU;
import onlineshop.models.CasePC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CPURepository extends JpaRepository<CPU, Integer> {
    Optional<CPU> findById(int id);
}
