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
@Table(name = "departments")

public class Department {

    @Id
    @Column(length = 100)
    private String id;
    private String name;
    private String model;
    private String serial_number;
    private String booking_duration;
    private String created_at;
    private String updated_at;

}
