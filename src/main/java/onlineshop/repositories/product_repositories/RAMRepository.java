package onlineshop.repositories.product_repositories;

import onlineshop.models.products.RAM;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RAMRepository extends CommonRepository<RAM> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM ram WHERE brand IS NOT NULL", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM ram WHERE model IS NOT NULL", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT ddr FROM ram WHERE ddr IS NOT NULL ORDER BY ddr", nativeQuery = true)
	List<String> getUniqueDdr();

	@Query(value = "SELECT DISTINCT frequency FROM ram WHERE frequency IS NOT NULL ORDER BY frequency", nativeQuery = true)
	List<Integer> getUniqueFrequency();

	@Query(value = "SELECT DISTINCT capacity FROM ram WHERE capacity IS NOT NULL ORDER BY capacity", nativeQuery = true)
	List<String> getUniqueCapacity();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM ram WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM ram WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
