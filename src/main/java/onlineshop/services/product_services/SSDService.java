package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.SSD;
import onlineshop.repositories.SSDRepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SSDService implements ProductService<SSD> {
    private final SSDRepository ssdRepository;

    @Override
    public List<SSD> show() {
        return ssdRepository.findAll();
    }

    @Override
    public Optional<SSD> find(int id) {
        return Optional.empty();
    }

    @Transactional
    @Override
    public void add(SSD ssd) {
        ssdRepository.save(ssd);
    }

    @Transactional
    @Override
    public void update(int id, SSD ssd) {
        ssd.setId(id);
        ssdRepository.save(ssd);
    }
}