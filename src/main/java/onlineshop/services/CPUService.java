package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.CPU;
import onlineshop.repositories.CPURepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CPUService {
    private final CPURepository cpuRepository;

    public List<CPU> cpuList() { // Displays a list of CPUs
        return cpuRepository.findAll();
    }
    public Optional<CPU> findCpuById(int id) { // Displays a CPU by id
        return cpuRepository.findById(id);
    }
    @Transactional
    public void addCpu(CPU cpu) { // Adds a CPU
        cpuRepository.save(cpu);
    }
    @Transactional
    public void updateInfoAboutCpu(int id, CPU cpu) { // Updates info about for a CPU
        cpu.setId(id);
        cpuRepository.save(cpu);
    }
}
