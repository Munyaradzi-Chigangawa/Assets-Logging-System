package com.example.backend.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "laptops")

public class Laptop {

    @Id
    @Column(length = 100)
    private String id;
    private String laptop_name;
    private String laptop_model;
    private String laptop_serial_number;
    private String booking_duration;
    private String created_at;
    private String updated_at;
}
