package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.CoolerCPU;
import onlineshop.repositories.CoolerCPURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoolerCPUService{
    private final CoolerCPURepository coolerCPURepository;

    public List<CoolerCPU> showCoolerCPUAll() { // Displays a list of all coolers for CPU
        return coolerCPURepository.findAll();
    }
    public Optional<CoolerCPU> findCoolerCPUById(int id) { // Displays cooler for CPU by id
        return coolerCPURepository.findById(id);
    }
    @Transactional
    public void addCoolerCPU(CoolerCPU coolerCPU) { // Adds a cooler for CPU
        coolerCPURepository.save(coolerCPU);
    }
    @Transactional
    public void updateInfoAboutCoolerCPU(int id, CoolerCPU coolerCPU) { // Updates info about cooler for CPU
        coolerCPU.setId(id);
        coolerCPURepository.save(coolerCPU);
    }
}