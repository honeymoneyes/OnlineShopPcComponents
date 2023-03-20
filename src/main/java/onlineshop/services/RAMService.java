package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.RAM;
import onlineshop.repositories.RAMRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RAMService {
    private final RAMRepository ramRepository;

    public List<RAM> ramList() { // Displays a list of a RAM
        return ramRepository.findAll();
    }
    public Optional<RAM> findRamById(int id) { // Displays a RAM by id
        return ramRepository.findById(id);
    }
    @Transactional
    public void addRam(RAM ram) { // Adds a RAM
        ramRepository.save(ram);
    }
    @Transactional
    public void updateInfoAboutRam(int id, RAM ram) { // Updates info about for a RAM
        ram.setId(id);
        ramRepository.save(ram);
    }
}
