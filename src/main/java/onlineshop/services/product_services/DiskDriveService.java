package onlineshop.services.product_services;

import onlineshop.models.products.CasePC;
import onlineshop.models.products.DiskDrive;
import onlineshop.repositories.product_repositories.CasePCRepository;
import onlineshop.repositories.product_repositories.DiskDriveRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class DiskDriveService extends ProductAbstractService<DiskDrive, DiskDriveRepository> {

	public DiskDriveService(DiskDriveRepository repository) {
		super(repository);
	}

	@Override
	public List<DiskDrive> show() {
		return repository.findAll();
	}

	@Override
	public Optional<DiskDrive> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(DiskDrive diskDrive) {
		repository.save(diskDrive);
	}

	@Transactional
	@Override
	public void update(int id, DiskDrive diskDrive) {
		diskDrive.setId(id);
		repository.save(diskDrive);
	}
}
