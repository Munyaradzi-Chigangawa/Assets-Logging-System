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

//    @RequestMapping ( value = "/getProjectors", method = RequestMethod.GET, produces = "application/json")
//    public List <Projector> getProjectors() {
//        List<Projector> list = new ArrayList<>();
//        projectorRepository.findAll().forEach(list::add);
//        return list;
//    }

//    @RequestMapping ( value = "/count", method = RequestMethod.GET, produces = "application/json")
//    public int noOfProjectors() {
//        return (int) projectorRepository.count();
//    }

    @PostMapping( value = "/addProjector")
    public ResponseEntity<Projector> addProjector (@RequestBody ProjectorDto projector) {
        log.info("Projector Successfully Added.");
        return new ResponseEntity<>(projectorService.save(projector), HttpStatus.CREATED);
    }
//    @RequestMapping ( value = "/deleteProjector", method = RequestMethod.POST, produces = "application/json")
//    public void deleteProjector (@RequestBody List<Projector> projectors) {
//        System.out.println("Deleted Projector");
//        projectorRepository.deleteAll(projectors);
//    }


//    @RequestMapping ( value = "/cancelProjectorBooking", method = RequestMethod.POST, produces = "application/json")
//    public void cancelProjectorBooking (@RequestBody Booking bookingDetails) {
//        System.out.println(bookingDetails.split(":"[0]));
//        bookingRepository.deleteByBookingId(bookingDetails);
//    }
}
