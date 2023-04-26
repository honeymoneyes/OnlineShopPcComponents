package onlineshop.services.product_services;

import onlineshop.models.products.Motherboard;
import onlineshop.repositories.product_repositories.MotherboardRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class MotherboardService extends ProductAbstractService<Motherboard, MotherboardRepository> {

	public MotherboardService(MotherboardRepository repository) {
		super(repository);
	}

	//CRUD methods
	@Override
	public List<Motherboard> show() {
		return repository.findAll();
	}

	@Override
	public Optional<Motherboard> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(Motherboard motherboard) {
		repository.save(motherboard);
	}

	@Transactional
	@Override
	public void update(int id, Motherboard motherboard) {
		motherboard.setId(id);
		repository.save(motherboard);
	}

	/********************************************/

	//Filters method
	@Override
	public List<String> showUniqueBrand() {
		return repository.getUniqueBrands();
	}

	@Override
	public List<String> showModels() {
		return repository.getModels();
	}

	public List<String> showUniqueSocket() {
		return repository.getUniqueSocket();
	}

	public List<String> showUniqueChipset() {
		return repository.getUniqueChipset();
	}

	public List<Integer> showUniqueRam() {
		return repository.getUniqueRam();
	}

	public List<String> showUniqueForm() {
		return repository.getUniqueForm();
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
