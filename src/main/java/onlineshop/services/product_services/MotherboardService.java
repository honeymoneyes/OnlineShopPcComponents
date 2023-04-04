package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.Motherboard;
import onlineshop.repositories.MotherboardRepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MotherboardService implements ProductService<Motherboard> {
    private final MotherboardRepository motherboardRepository;

    @Override
    public List<Motherboard> show() {
        return motherboardRepository.findAll();
    }

    @Override
    public Optional<Motherboard> find(int id) {
        return motherboardRepository.findById(id);
    }

    @Transactional
    @Override
    public void add(Motherboard motherboard) {
        motherboardRepository.save(motherboard);
    }

    @Transactional
    @Override
    public void update(int id, Motherboard motherboard) {
        motherboard.setId(id);
        motherboardRepository.save(motherboard);
    }
}
