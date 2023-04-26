package onlineshop.repositories.product_repositories;

import onlineshop.models.products.Motherboard;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotherboardRepository extends CommonRepository<Motherboard> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM motherboard WHERE brand IS NOT NULL", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM motherboard WHERE model IS NOT NULL", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT socket FROM motherboard WHERE socket IS NOT NULL ORDER BY socket", nativeQuery = true)
	List<String> getUniqueSocket();

	@Query(value = "SELECT DISTINCT chipset FROM motherboard WHERE chipset IS NOT NULL ORDER BY chipset", nativeQuery = true)
	List<String> getUniqueChipset();

	@Query(value = "SELECT DISTINCT ram FROM motherboard WHERE ram IS NOT NULL ORDER BY ram", nativeQuery = true)
	List<Integer> getUniqueRam();

	@Query(value = "SELECT DISTINCT form FROM motherboard WHERE form IS NOT NULL ORDER BY form", nativeQuery = true)
	List<String> getUniqueForm();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM motherboard WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM motherboard WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
