package onlineshop.services.product_services;

import onlineshop.models.products.HDD;
import onlineshop.repositories.product_repositories.HDDRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class HDDService extends ProductAbstractService<HDD, HDDRepository> {

	public HDDService(HDDRepository repository) {
		super(repository);
	}

	@Override
	public List<HDD> show() {
		return repository.findAll();
	}

	@Override
	public Optional<HDD> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(HDD HDD) {
		repository.save(HDD);
	}

	@Transactional
	@Override
	public void update(int id, HDD HDD) {
		HDD.setId(id);
		repository.save(HDD);
	}
}
