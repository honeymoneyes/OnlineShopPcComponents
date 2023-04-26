package onlineshop.services.product_services;

import onlineshop.models.products.PowerPC;
import onlineshop.repositories.product_repositories.PowerPCRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PowerPCService extends ProductAbstractService<PowerPC, PowerPCRepository> {

	public PowerPCService(PowerPCRepository repository) {
		super(repository);
	}

	//CRUD methods
	@Override
	public List<PowerPC> show() {
		return repository.findAll();
	}

	@Override
	public Optional<PowerPC> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(PowerPC powerPC) {
		repository.save(powerPC);
	}

	@Transactional
	@Override
	public void update(int id, PowerPC powerPC) {
		powerPC.setId(id);
		repository.save(powerPC);
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

	public List<Integer> showUniquePower() {
		return repository.getUniquePower();
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
