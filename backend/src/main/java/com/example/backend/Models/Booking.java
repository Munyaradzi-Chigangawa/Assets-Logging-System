package com.example.backend.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookings")

public class Booking {

    @Id
    @Column(length = 100)
    private String bookingId;
    private String name;
    private String serialNumber;
    private String model;
    private String quantity;
    private String updatedAt;

}
