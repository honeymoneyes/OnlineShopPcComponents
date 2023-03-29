package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.Motherboard;
import onlineshop.repositories.MotherboardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MotherboardService {
    private final MotherboardRepository motherboardRepository;

    public List<Motherboard> showMotherboardList() { // Displays a list of a motherboards
        return motherboardRepository.findAll();
    }

    public Optional<Motherboard> findMotherboardById(int id) { // Displays a motherboards by id
        return motherboardRepository.findById(id);
    }

    @Transactional
    public void addMotherboard(Motherboard motherboard) { // Adds a motherboards
        motherboardRepository.save(motherboard);
    }

    @Transactional
    public void updateInfoAboutMotherboard(int id, Motherboard motherboard) { // Updates info about for a motherboards
        motherboard.setId(id);
        motherboardRepository.save(motherboard);
    }
}
