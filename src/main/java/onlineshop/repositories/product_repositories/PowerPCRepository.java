package onlineshop.repositories.product_repositories;

import onlineshop.models.products.PowerPC;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerPCRepository extends CommonRepository<PowerPC> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM powerpc WHERE brand IS NOT NULL", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM powerpc WHERE model IS NOT NULL", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT power FROM powerpc WHERE power IS NOT NULL ORDER BY power ", nativeQuery = true)
	List<Integer> getUniquePower();
	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM powerpc WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM powerpc WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
