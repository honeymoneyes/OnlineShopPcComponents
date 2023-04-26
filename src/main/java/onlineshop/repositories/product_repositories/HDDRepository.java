package onlineshop.repositories.product_repositories;

import onlineshop.models.products.HDD;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HDDRepository extends CommonRepository<HDD> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM hdd WHERE brand IS NOT NULL ORDER BY brand", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM hdd WHERE model IS NOT NULL ORDER BY model", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT capacity FROM hdd WHERE capacity IS NOT NULL ORDER BY capacity", nativeQuery = true)
	List<Integer> getUniqueCapacity();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM hdd WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM hdd WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
