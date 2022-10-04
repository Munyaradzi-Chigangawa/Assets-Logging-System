package com.example.backend.Controllers;
import com.example.backend.Models.Booking;
import com.example.backend.Repositories.BookingRepository;
import com.example.backend.Services.BookingService;
import com.example.backend.dto.BookingDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1")
@CrossOrigin(value = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@Slf4j
public class BookingController {
    @Autowired
    private BookingService bookingService;

    // Booking Endpoint
    @PostMapping(value = "/make-booking")
    public ResponseEntity <Booking> makeBooking (@RequestBody BookingDto booking, @RequestParam Long peopleId) {
        log.info("Successfully Booked.");
        return new ResponseEntity<>(bookingService.save(booking, peopleId), HttpStatus.CREATED);
    }

    // Accept Booking Endpoint


    // Declining Booking Endpoint


    // Bookings for User Endpoint
    @GetMapping( value = "/get-bookings")
    public ResponseEntity<List<Booking>> getBookings(@RequestParam long peopleId) {
        log.info("Bookings Retrieved.");
        return new ResponseEntity<>(bookingService.getBookings(peopleId), HttpStatus.OK);
    }
}
