package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.DiskDrive;
import onlineshop.repositories.DiskDriveRepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DiskDriveService implements ProductService<DiskDrive> {
    private final DiskDriveRepository diskDriveRepository;

    @Override
    public List<DiskDrive> show() {
        return diskDriveRepository.findAll();
    }

    @Override
    public Optional<DiskDrive> find(int id) {
        return diskDriveRepository.findById(id);
    }

    @Transactional
    @Override
    public void add(DiskDrive diskDrive) {
        diskDriveRepository.save(diskDrive);
    }

    @Transactional
    @Override
    public void update(int id, DiskDrive diskDrive) {
        diskDrive.setId(id);
        diskDriveRepository.save(diskDrive);
    }
}
