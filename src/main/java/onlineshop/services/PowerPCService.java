package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.PowerPC;
import onlineshop.repositories.PowerPCRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PowerPCService {
    private final PowerPCRepository powerPCRepository;

    public List<PowerPC> showPowerPCList() { // Displays a list of a PowerPC
        return powerPCRepository.findAll();
    }
    public Optional<PowerPC> findPowerPCById(int id) { // Displays a PowerPC by id
        return powerPCRepository.findById(id);
    }
    @Transactional
    public void addPowerPC(PowerPC powerPC) { // Adds a PowerPC
        powerPCRepository.save(powerPC);
    }
    @Transactional
    public void updateInfoAboutPowerPC(int id, PowerPC powerPC) { // Updates info about for a PowerPC
        powerPC.setId(id);
        powerPCRepository.save(powerPC);
    }
}
