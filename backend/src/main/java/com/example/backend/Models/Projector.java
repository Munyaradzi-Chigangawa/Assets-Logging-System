package com.example.backend.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projectors")

public class Projector implements Serializable {

    @Id
    @Column(length = 100)
    private String id;
    private String projector_name;
    private String projector_model;
    private String projector_number;
//    private String booking_duration;
//    private String created_at;
//    private String updated_at;
}

