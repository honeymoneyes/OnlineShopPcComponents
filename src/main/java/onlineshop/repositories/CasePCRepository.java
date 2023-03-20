package onlineshop.repositories;

import onlineshop.models.CasePC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasePCRepository extends JpaRepository<CasePC, Integer> {
}
