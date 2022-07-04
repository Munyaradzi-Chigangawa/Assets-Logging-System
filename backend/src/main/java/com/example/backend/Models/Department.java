package com.example.backend.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")

public class Department implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100)
    private Long id;
    @Column(name = "department_name", columnDefinition = "varchar(255)")
    private String departmentName;
    private String departmentCode;
    private String departmentDescription;
    private String createdAt;
    private String updatedAt;
}