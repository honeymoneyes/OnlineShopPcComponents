package onlineshop.services.product_services;

import onlineshop.models.products.SSD;
import onlineshop.repositories.product_repositories.SSDRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SSDService extends ProductAbstractService<SSD, SSDRepository> {
	public SSDService(SSDRepository repository) {
		super(repository);
	}

	//CRUD methods
	@Override
	public List<SSD> show() {
		return repository.findAll();
	}

	@Transactional
	@Override
	public void save(SSD ssd) {
		repository.save(ssd);
	}

	@Transactional
	@Override
	public void update(int id, SSD ssd) {
		ssd.setId(id);
		repository.save(ssd);
	}

	@Override
	public Optional<SSD> find(int id) {
		return repository.findById(id);
	}

	/********************************************/

	//Filters methods
	@Override
	public List<String> showUniqueBrand() {
		return repository.getUniqueBrands();
	}

	@Override
	public List<String> showModels() {
		return repository.getModels();
	}

	public List<Integer> showUniqueCapacity() {
		return repository.getUniqueCapacity();
	}

	@Override
	public List<Integer> showUniqueFloorPrices() {
		return repository.getUniqueFloorPrices();
	}

	@Override
	public List<Integer> showUniqueCeilPrices() {
		return repository.getUniqueCeilPrices();
	}
}