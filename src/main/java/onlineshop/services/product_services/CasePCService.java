package onlineshop.services.product_services;

import onlineshop.models.products.CasePC;
import onlineshop.repositories.product_repositories.CasePCRepository;
import onlineshop.services.CommonService;
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
}
