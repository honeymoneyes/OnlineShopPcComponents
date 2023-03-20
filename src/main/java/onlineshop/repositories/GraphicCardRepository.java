package onlineshop.repositories;

import onlineshop.models.DiskDrive;
import onlineshop.models.GraphicCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GraphicCardRepository extends JpaRepository<GraphicCard, Integer> {
    Optional<GraphicCard> findById(int id);
}
