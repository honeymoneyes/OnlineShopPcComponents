package onlineshop.repositories.product_repositories;

import onlineshop.models.products.CasePC;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CasePCRepository extends CommonRepository<CasePC> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM casepc WHERE brand IS NOT NULL", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM casepc WHERE model IS NOT NULL", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT form FROM casepc WHERE form IS NOT NULL", nativeQuery = true)
	List<String> getUniqueForm();

	@Query(value = "SELECT DISTINCT coolers FROM casepc WHERE casepc.coolers IS NOT NULL", nativeQuery = true)
	List<Integer> getUniqueCoolers();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM casepc WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM casepc WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
