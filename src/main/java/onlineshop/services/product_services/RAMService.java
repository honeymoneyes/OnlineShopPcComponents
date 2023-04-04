package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.RAM;
import onlineshop.repositories.RAMRepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RAMService implements ProductService<RAM> {
    private final RAMRepository ramRepository;

    @Override
    public List<RAM> show() {
        return ramRepository.findAll();
    }

    @Override
    public Optional<RAM> find(int id) {
        return ramRepository.findById(id);
    }

    @Transactional
    @Override
    public void add(RAM ram) {
        ramRepository.save(ram);
    }

    @Transactional
    @Override
    public void update(int id, RAM ram) {
        ram.setId(id);
        ramRepository.save(ram);
    }
}
