package onlineshop.services.product_services;

import onlineshop.models.products.RAM;
import onlineshop.repositories.product_repositories.RAMRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class RAMService extends ProductAbstractService<RAM, RAMRepository> {

	public RAMService(RAMRepository repository) {
		super(repository);
	}

	//CRUD methods
	@Override
	public List<RAM> show() {
		return repository.findAll();
	}

	@Override
	public Optional<RAM> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(RAM ram) {
		repository.save(ram);
	}

	@Transactional
	@Override
	public void update(int id, RAM ram) {
		ram.setId(id);
		repository.save(ram);
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

	public List<String> showUniqueDdr() {
		return repository.getUniqueDdr();
	}

	public List<Integer> showUniqueFrequency() {
		return repository.getUniqueFrequency();
	}

	public List<String> showUniqueCapacity() {
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
