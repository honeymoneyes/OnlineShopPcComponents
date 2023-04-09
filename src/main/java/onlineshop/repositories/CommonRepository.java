package onlineshop.repositories;

import onlineshop.models.ProductAbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface CommonRepository<E extends ProductAbstractEntity> extends JpaRepository<E, Integer> {
}
