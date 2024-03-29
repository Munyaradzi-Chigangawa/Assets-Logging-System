package com.example.backend.Services;
import com.example.backend.Models.Booking;
import com.example.backend.Models.People;
import com.example.backend.Repositories.BookingRepository;
import com.example.backend.dto.BookingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor

public class BookingService {
    @Autowired

    private final BookingRepository bookingRepository;
    private final PeopleService peopleService;

    //    Adding a booking Buy each user
    public Booking save(BookingDto booking, Long peopleId) {

        People people = peopleService.findById(peopleId);

        Booking booking1 = Booking.builder()
                .assetName(booking.getAssetName())
                .borrowedBy(booking.getBorrowedBy())
                .serialNumber(booking.getSerialNumber())
                .borrowedDate(booking.getBorrowedDate())
                .returnDate(booking.getReturnDate())
                .model(booking.getModel())
                .status(booking.getStatus())
                .createdAt(booking.getCreatedAt())
                .updatedAt(booking.getUpdatedAt())
                .people(people)
                .build();
        return bookingRepository.save(booking1);
    }


    // Get Bookings by each user
    public List<Booking> getBookings(Long peopleId) {
        People people = peopleService.findById(peopleId);
        return bookingRepository.getBookingByPeople(people);
    }

//    Get All Bookings
    public List <Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

//    Deleting Booking
    public Booking deleteBooking(Long id) {
        bookingRepository.deleteById(id);
        return null;
    }
}
