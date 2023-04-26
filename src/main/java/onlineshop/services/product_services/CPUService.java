package onlineshop.services.product_services;

import onlineshop.models.products.CPU;
import onlineshop.repositories.product_repositories.CPURepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CPUService extends ProductAbstractService<CPU, CPURepository> {

	public CPUService(CPURepository repository) {
		super(repository);
	}

	// CRUD methods
	@Override
	public List<CPU> show() {
		return repository.findAll();
	}

	@Override
	public Optional<CPU> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(CPU cpu) {
		repository.save(cpu);
	}

	@Transactional
	@Override
	public void update(int id, CPU cpu) {
		cpu.setId(id);
		repository.save(cpu);
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

	public List<String> showUniqueSocket() {
		return repository.getUniqueSocket();
	}

	public List<String> showUniqueFamily() {
		return repository.getUniqueFamily();
	}

	public List<Integer> showUniqueCore() {
		return repository.getUniqueCore();
	}

	public List<Double> showUniqueFrequency() {
		return repository.getUniqueFrequency();
	}

	public List<Integer> showUniqueTdp() {
		return repository.getUniqueTdp();
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
