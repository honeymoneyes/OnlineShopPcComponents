package onlineshop.repositories.product_repositories;

import onlineshop.models.products.GraphicCard;
import onlineshop.repositories.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GraphicCardRepository extends CommonRepository<GraphicCard> {
	@Override
	@Query(value = "SELECT DISTINCT brand FROM graphiccard WHERE brand IS NOT NULL", nativeQuery = true)
	List<String> getUniqueBrands();

	@Override
	@Query(value = "SELECT model FROM graphiccard WHERE model IS NOT NULL", nativeQuery = true)
	List<String> getModels();

	@Query(value = "SELECT DISTINCT family FROM graphiccard WHERE family IS NOT NULL", nativeQuery = true)
	List<String> getUniqueFamily();

	@Query(value = "SELECT DISTINCT frequency FROM graphiccard WHERE frequency IS NOT NULL ORDER BY frequency", nativeQuery = true)
	List<Integer> getUniqueFrequency();

	@Query(value = "SELECT DISTINCT memory FROM graphiccard WHERE memory IS NOT NULL ORDER BY memory ", nativeQuery = true)
	List<Integer> getUniqueMemory();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(FLOOR(price) AS NUMERIC)) as floor_price FROM graphiccard WHERE price IS NOT NULL ORDER BY floor_price", nativeQuery = true)
	List<Integer> getUniqueFloorPrices();

	@Override
	@Query(value = "SELECT DISTINCT ROUND(CAST(CEIL(price) AS NUMERIC)) as ceil_price FROM graphiccard WHERE price IS NOT NULL ORDER BY ceil_price", nativeQuery = true)
	List<Integer> getUniqueCeilPrices();
}
