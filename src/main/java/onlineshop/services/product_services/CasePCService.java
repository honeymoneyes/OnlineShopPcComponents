package onlineshop.services.product_services;

import onlineshop.models.products.CasePC;
import onlineshop.repositories.product_repositories.CasePCRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CasePCService extends ProductAbstractService<CasePC, CasePCRepository> {

	public CasePCService(CasePCRepository repository) {
		super(repository);
	}

	// CRUD methods
	@Override
	public List<CasePC> show() {
		return repository.findAll();
	}

	@Override
	public Optional<CasePC> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(CasePC casePC) {
		repository.save(casePC);
	}

	@Transactional
	@Override
	public void update(int id, CasePC casePC) {
		casePC.setId(id);
		repository.save(casePC);
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

	public List<String> showForm() {
		return repository.getUniqueForm();
	}

	public List<Integer> showCoolers() {
		return repository.getUniqueCoolers();
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
