package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.DiskDrive;
import onlineshop.repositories.DiskDriveRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DiskDriveService {
    private final DiskDriveRepository diskDriveRepository;

    public List<DiskDrive> showDiskDriveList() { // Displays a list of a disk drive
        return diskDriveRepository.findAll();
    }

    public Optional<DiskDrive> findDiskDriveById(int id) { // Displays a disk drive by id
        return diskDriveRepository.findById(id);
    }

    @Transactional
    public void addDiskDrive(DiskDrive diskDrive) { // Adds a disk drive
        diskDriveRepository.save(diskDrive);
    }

    @Transactional
    public void updateInfoAboutDiskDrive(int id, DiskDrive diskDrive) { // Updates info about for a disk drive
        diskDrive.setId(id);
        diskDriveRepository.save(diskDrive);
    }
}
