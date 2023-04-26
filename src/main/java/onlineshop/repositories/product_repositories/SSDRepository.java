package onlineshop.repositories.product_repositories;

import onlineshop.models.products.SSD;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SSDRepository extends CommonRepository<SSD> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM ssd WHERE brand IS NOT NULL", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM ssd WHERE model IS NOT NULL", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT capacity FROM ssd WHERE capacity IS NOT NULL ORDER BY capacity", nativeQuery = true)
	List<Integer> getUniqueCapacity();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM ssd WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM ssd WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
