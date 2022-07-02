package com.example.backend.Services;

import com.example.backend.Models.Projector;
import com.example.backend.Repositories.ProjectorRepository;
import com.example.backend.dto.ProjectorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

    public Projector getProjectors(ProjectorDto projector) {
        Projector projector1 = Projector.builder()
                .createdAt(projector.getCreatedAt())
                .updatedAt(projector.getUpdatedAt())
                .projectorModel(projector.getProjector_model())
                .projectorName(projector.getProjector_name())
                .projectorNumber(projector.getProjector_number())
                .build();
        return projectorRepository.findAll().stream()
                .filter(p -> p.getProjectorModel().equals(projector.getProjector_model()))
                .findFirst()
                .orElse(projector1);
    }
}
