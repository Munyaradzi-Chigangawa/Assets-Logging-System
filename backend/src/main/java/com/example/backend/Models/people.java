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

@Table(name = "people")
public class people {
    @Id
    @Column(length = 100)
    private String id;
    private String name;
    private String department;
    private String designation;
    private String phone;
    private String email;
}


