package onlineshop.services.product_services;

import onlineshop.models.products.CPU;
import onlineshop.models.products.CasePC;
import onlineshop.repositories.product_repositories.CPURepository;
import onlineshop.repositories.product_repositories.CasePCRepository;
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
}
