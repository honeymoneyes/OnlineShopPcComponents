package onlineshop.services.product_services;

import onlineshop.models.products.CasePC;
import onlineshop.models.products.Motherboard;
import onlineshop.repositories.product_repositories.CasePCRepository;
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
}
