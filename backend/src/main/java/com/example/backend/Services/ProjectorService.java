package com.example.backend.Services;
import com.example.backend.Models.Projector;
import com.example.backend.Repositories.ProjectorRepository;
import com.example.backend.dto.ProjectorDto;
import com.example.backend.exceptions.ProjectorNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectorService {
    @Autowired
    private final ProjectorRepository projectorRepository;

    public Projector save (ProjectorDto projector) {
        Projector projector1 = Projector.builder()
                .projectorModel(projector.getProjectorModel())
                .projectorName(projector.getProjectorName())
                .projectorSerialNumber(projector.getProjectorSerialNumber())
                .projectorStatus(projector.getProjectorStatus())
                .createdAt(projector.getCreatedAt())
                .updatedAt(projector.getUpdatedAt())
                .build();
        return projectorRepository.save(projector1);
    }

    public List<Projector> getAllProjectors() {

        return projectorRepository.findAll();
    }

    public Projector getProjector(Long id) {

        return projectorRepository.findById(id)
                .orElseThrow(() -> new ProjectorNotFound("Projector id " + id + "was not found"));
    }

    // Delete Projector
    public Projector deleteProjector (Long id) {
       projectorRepository.deleteAllById(Collections.singleton(id));
        return  null;
    }

    // Update Projector
    public Projector updateProjector (ProjectorDto projectorDto, Long id) {
        Projector projector = projectorRepository.findById(id)
                .orElseThrow(() -> new ProjectorNotFound("No Projector Found"));
        projector.setProjectorModel(projectorDto.getProjectorModel());
        projector.setProjectorName(projectorDto.getProjectorName());
        projector.setProjectorSerialNumber(projectorDto.getProjectorSerialNumber());
        projector.setProjectorStatus(projectorDto.getProjectorStatus());
        projector.setUpdatedAt(projectorDto.getUpdatedAt());
        return projectorRepository.save(projector);
    }


}
