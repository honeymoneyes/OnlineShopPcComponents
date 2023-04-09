package onlineshop.services.product_services;

import onlineshop.models.products.CasePC;
import onlineshop.models.products.RAM;
import onlineshop.repositories.product_repositories.CasePCRepository;
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
}
