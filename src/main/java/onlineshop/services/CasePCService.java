package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.CasePC;
import onlineshop.repositories.CasePCRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CasePCService {
    private final CasePCRepository casePCRepository;

    public List<CasePC> showCasePCAll() { // Displays a list of all PC cases
        return casePCRepository.findAll();
    }

    public Optional<CasePC> findCasePCById(int id) { // Displays PC case by id
        return casePCRepository.findById(id);
    }

    @Transactional
    public void addCase(CasePC casePC) { // Adds a PC case
        casePCRepository.save(casePC);
    }

    @Transactional
    public void updateInfoAboutCase(int id, CasePC casePC) { // Updates info about PC case
        casePC.setId(id);
        casePCRepository.save(casePC);
    }
}
