package onlineshop.repositories.product_repositories;

import onlineshop.models.products.CPU;
import onlineshop.models.products.CasePC;
import onlineshop.repositories.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CPURepository extends CommonRepository<CPU> {
}
