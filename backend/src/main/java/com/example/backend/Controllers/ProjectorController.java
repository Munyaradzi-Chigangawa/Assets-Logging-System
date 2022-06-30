package com.example.backend.Controllers;
import com.example.backend.Models.Booking;
import com.example.backend.Models.Projector;
import com.example.backend.Repositories.BookingRepository;
import com.example.backend.Repositories.ProjectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class ProjectorController {
    @Autowired
    private ProjectorRepository projectorRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @RequestMapping ( value = "/getProjectors", method = RequestMethod.GET, produces = "application/json")
    public List <Projector> getProjectors() {
        List<Projector> list = new ArrayList<>();
        projectorRepository.findAll().forEach(list::add);
        return list;
    }

    @RequestMapping ( value = "/getProjectorBookingDetails", method = RequestMethod.GET, produces = "application/json")
    public List <Booking> getProjectorBookingDetails() {
        List<Booking> list = new ArrayList<Booking>();
        bookingRepository.findAll().forEach(list::add);
        return list;
    }

    @RequestMapping ( value = "/count", method = RequestMethod.GET, produces = "application/json")
    public int noOfProjectors() {
        return (int) projectorRepository.count();
    }

    @RequestMapping ( value = "/addProjector", method = RequestMethod.POST, produces = "application/json")
    public void addProjector (@RequestBody List<Projector> projectors) {
        System.out.println("Added Projector");
        projectorRepository.saveAll(projectors);
    }
    @RequestMapping ( value = "/deleteProjector", method = RequestMethod.POST, produces = "application/json")
    public void deleteProjector (@RequestBody List<Projector> projectors) {
        System.out.println("Deleted Projector");
        projectorRepository.deleteAll(projectors);
    }

    @RequestMapping ( value = "/makeProjectorBooking", method = RequestMethod.POST, produces = "application/json")
    public void makeProjectorBooking (@RequestBody Booking bookingDetails) {
        System.out.println("Booked Projector");
        bookingRepository.save(bookingDetails);
    }

//    @RequestMapping ( value = "/cancelProjectorBooking", method = RequestMethod.POST, produces = "application/json")
//    public void cancelProjectorBooking (@RequestBody Booking bookingDetails) {
//        System.out.println(bookingDetails.split(":"[0]));
//        bookingRepository.deleteByBookingId(bookingDetails);
//    }
}
