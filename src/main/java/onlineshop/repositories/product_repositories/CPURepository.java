package onlineshop.repositories.product_repositories;

import onlineshop.models.products.CPU;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CPURepository extends CommonRepository<CPU> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM cpu WHERE brand IS NOT NULL", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM cpu WHERE model IS NOT NULL", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT socket FROM cpu WHERE socket IS NOT NULL ORDER BY socket", nativeQuery = true)
	List<String> getUniqueSocket();

	@Query(value = "SELECT DISTINCT family FROM cpu WHERE family IS NOT NULL ORDER BY family", nativeQuery = true)
	List<String> getUniqueFamily();

	@Query(value = "SELECT DISTINCT core FROM cpu WHERE core IS NOT NULL ORDER BY core", nativeQuery = true)
	List<Integer> getUniqueCore();

	@Query(value = "SELECT DISTINCT frequency_max FROM cpu WHERE frequency_max IS NOT NULL ORDER BY frequency_max", nativeQuery = true)
	List<Double> getUniqueFrequency();

	@Query(value = "SELECT DISTINCT tdp_max FROM cpu WHERE tdp_max IS NOT NULL ORDER BY tdp_max", nativeQuery = true)
	List<Integer> getUniqueTdp();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM cpu WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM cpu WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
