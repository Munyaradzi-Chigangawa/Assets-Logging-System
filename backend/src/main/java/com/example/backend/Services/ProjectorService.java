package com.example.backend.Services;

import com.example.backend.Models.Projector;
import com.example.backend.Repositories.ProjectorRepository;
import com.example.backend.dto.ProjectorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectorService {
    @Autowired
    private final ProjectorRepository projectorRepository;

    public Projector save (ProjectorDto projector) {
        Projector projector1 = Projector.builder()
                .projectorModel(projector.getProjector_model())
                .projectorName(projector.getProjector_name())
                .projectorNumber(projector.getProjector_number())
                .createdAt(projector.getCreatedAt())
                .updatedAt(projector.getUpdatedAt())
                .build();
        return projectorRepository.save(projector1);
    }

    public List<Projector> getAllProjectors() {
        return projectorRepository.findAll();
    }

    public Projector getProjector(Long id) {
        return projectorRepository.findById(id).get();
    }

    public Projector deleteProjector(Long id) {
         projectorRepository.deleteById(id);
        return projectorRepository.findAll().get(0);
    }

    public Projector updateProjector(Long id, ProjectorDto projector) {
        Projector projector1 = Projector.builder()
                .projectorModel(projector.getProjector_model())
                .projectorName(projector.getProjector_name())
                .projectorNumber(projector.getProjector_number())
                .createdAt(projector.getCreatedAt())
                .updatedAt(projector.getUpdatedAt())
                .build();
        return projectorRepository.save(projector1);
    }
}
