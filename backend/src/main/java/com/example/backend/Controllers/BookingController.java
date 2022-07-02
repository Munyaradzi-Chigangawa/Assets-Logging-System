package com.example.backend.Controllers;

import com.example.backend.Models.Booking;
import com.example.backend.Repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;

    @RequestMapping( value = "/makeProjectorBooking", method = RequestMethod.POST, produces = "application/json")
    public void makeProjectorBooking (@RequestBody Booking bookingDetails) {
        System.out.println("Booked Projector");
        bookingRepository.save(bookingDetails);
    }

    @RequestMapping ( value = "/getProjectorBookingDetails", method = RequestMethod.GET, produces = "application/json")
    public List<Booking> getProjectorBookingDetails() {
        List<Booking> list = new ArrayList<Booking>();
        bookingRepository.findAll().forEach(list::add);
        return list;
    }
}
