package com.example.backend.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "bookings")

public class Booking {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100)
    private Long bookingId;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "people_id", foreignKey = @ForeignKey(name = "people_id_fk"), referencedColumnName = "people_id")
    private People people;
    @Column(name = "asset_name", columnDefinition = "varchar(255)")
    private String assetName;
    private String borrowedBy;
    private String serialNumber;
    @CreatedDate
    private LocalDateTime borrowedDate;
    @LastModifiedDate
    private LocalDateTime returnDate;
    private String model;
//    private String quantity;
    private String status;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
