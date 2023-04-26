package onlineshop.services;

import onlineshop.models.ProductAbstractEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CommonService<E extends ProductAbstractEntity> {
	List<E> show();

	Optional<E> find(int id);

	void save(E e);

	void update(int id, E e);

	List<String> showUniqueBrand();

	List<String> showModels();

	List<Integer> showUniqueFloorPrices();

	List<Integer> showUniqueCeilPrices();
}
