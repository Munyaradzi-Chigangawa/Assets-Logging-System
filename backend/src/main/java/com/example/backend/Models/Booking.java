package com.example.backend.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookings")

public class Booking {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100)
    private Long bookingId;
    @Column(name = "asset_name", columnDefinition = "varchar(255)")
    private String assetName;
    private String borrowedBy;
    private String serialNumber;
    private String borrowedDate;
    private String returnDate;
    private String model;
    private String quantity;
    private String status;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;

}
