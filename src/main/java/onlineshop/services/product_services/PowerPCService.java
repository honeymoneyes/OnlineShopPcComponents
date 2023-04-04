package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.PowerPC;
import onlineshop.repositories.PowerPCRepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PowerPCService implements ProductService<PowerPC> {
    private final PowerPCRepository powerPCRepository;

    @Override
    public List<PowerPC> show() {
        return powerPCRepository.findAll();
    }

    @Override
    public Optional<PowerPC> find(int id) {
        return powerPCRepository.findById(id);
    }

    @Transactional
    @Override
    public void add(PowerPC powerPC) {
        powerPCRepository.save(powerPC);
    }

    @Transactional
    @Override
    public void update(int id, PowerPC powerPC) {
        powerPC.setId(id);
        powerPCRepository.save(powerPC);
    }
}
