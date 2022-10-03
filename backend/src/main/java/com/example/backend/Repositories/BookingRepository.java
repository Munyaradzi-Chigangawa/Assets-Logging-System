package com.example.backend.Repositories;
import com.example.backend.Models.Booking;
import com.example.backend.Models.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getBookingByPeople(People people);

}
