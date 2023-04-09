package onlineshop.repositories.product_repositories;

import onlineshop.models.products.CasePC;
import onlineshop.models.products.Motherboard;
import onlineshop.repositories.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardRepository extends CommonRepository<Motherboard> {
}
