package com.example.backend.Controllers;
import com.example.backend.Models.Booking;
import com.example.backend.Models.Projector;
import com.example.backend.Repositories.BookingRepository;
import com.example.backend.Repositories.ProjectorRepository;
import com.example.backend.Services.ProjectorService;
import com.example.backend.dto.ProjectorDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@Slf4j
public class ProjectorController {
    private final ProjectorService projectorService;

    @PostMapping( value = "/addProjector")
    public ResponseEntity<Projector> addProjector (@RequestBody ProjectorDto projector) {
        log.info("Projector Successfully Added.");
        return new ResponseEntity<>(projectorService.save(projector), HttpStatus.CREATED);
    }

    @GetMapping( value = "/getProjectors")
    public ResponseEntity<Projector> getProjectors() {
        log.info("Projectors Successfully Retrieved.");
        return new ResponseEntity<>(projectorService.getAllProjectors(), HttpStatus.OK);
    }

    @GetMapping( value = "/getProjector/{id}")
    public ResponseEntity<Projector> getProjector(@PathVariable Long id) {
        log.info("Projector Successfully Retrieved.");
        return new ResponseEntity<>(projectorService.getProjector(id), HttpStatus.OK);
    }

    @DeleteMapping( value = "/deleteProjector/{id}")
    public ResponseEntity<Projector> deleteProjector(@PathVariable Long id) {
        log.info("Projector Successfully Deleted.");
        return new ResponseEntity<>(projectorService.deleteProjector(id), HttpStatus.OK);
    }

    @PutMapping( value = "/updateProjector/{id}")
    public ResponseEntity<Projector> updateProjector(@PathVariable Long id, @RequestBody ProjectorDto projector) {
        log.info("Projector Successfully Updated.");
        return new ResponseEntity<>(projectorService.updateProjector(id, projector), HttpStatus.OK);
    }
}
