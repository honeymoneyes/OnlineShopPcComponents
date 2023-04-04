package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.CasePC;
import onlineshop.repositories.CasePCRepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CasePCService implements ProductService<CasePC> {
    private final CasePCRepository casePCRepository;

    @Override
    public List<CasePC> show() {
        return casePCRepository.findAll();
    }

    @Override
    public Optional<CasePC> find(int id) {
        return casePCRepository.findById(id);
    }

    @Transactional
    @Override
    public void add(CasePC casePC) {
        casePCRepository.save(casePC);
    }

    @Transactional
    @Override
    public void update(int id, CasePC casePC) {
        casePC.setId(id);
        casePCRepository.save(casePC);
    }
}
