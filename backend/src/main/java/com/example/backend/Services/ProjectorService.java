package com.example.backend.Services;

import com.example.backend.Models.Projector;
import com.example.backend.Repositories.ProjectorRepository;
import com.example.backend.dto.ProjectorDto;
import com.example.backend.exceptions.ProjectorNotFound;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Range;
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
                .projectorModel(projector.getProjectorModel())
                .projectorName(projector.getProjectorName())
                .projectorNumber(projector.getProjectorNumber())
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

    public Projector deleteProjector(Long id) {
         projectorRepository.deleteById(id);
        // return projectorRepository.findAll().get(0);
        return null;
    }

//    public Projector updateProjector(Long id, ProjectorDto projector) {
//        Projector projector1 = Projector.builder()
//                .projectorModel(projector.getProjectorModel())
//                .projectorName(projector.getProjectorName())
//                .projectorNumber(projector.getProjectorNumber())
//                .createdAt(projector.getCreatedAt())
//                .updatedAt(projector.getUpdatedAt())
//                .build();
//        return projectorRepository.save(projector1);
//    }
}
