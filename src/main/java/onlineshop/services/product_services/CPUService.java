package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.CPU;
import onlineshop.repositories.CPURepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CPUService implements ProductService<CPU> {
    private final CPURepository cpuRepository;

    @Override
    public List<CPU> show() {
        return cpuRepository.findAll();
    }

    @Override
    public Optional<CPU> find(int id) {
        return cpuRepository.findById(id);
    }

    @Transactional
    @Override
    public void add(CPU cpu) {
        cpuRepository.save(cpu);
    }

    @Transactional
    @Override
    public void update(int id, CPU cpu) {
        cpu.setId(id);
        cpuRepository.save(cpu);
    }
}
