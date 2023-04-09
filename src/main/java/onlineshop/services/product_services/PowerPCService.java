package onlineshop.services.product_services;

import onlineshop.models.products.CasePC;
import onlineshop.models.products.PowerPC;
import onlineshop.repositories.product_repositories.CasePCRepository;
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
}
