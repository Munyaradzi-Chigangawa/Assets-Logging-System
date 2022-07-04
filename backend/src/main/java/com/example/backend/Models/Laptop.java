package com.example.backend.Models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "laptops")

public class Laptop {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100)
    private String id;
    @Column(name = "laptop_name", columnDefinition = "varchar(255)")
    private String laptopName;
    private String laptopModel;
    private String LaptopBrand;
    private String laptopSerialNumber;
    private String processor;
    private String ram;
    private String storage;
    @CreationTimestamp
    private String createdAt;
    @CreationTimestamp
    private String updatedAt;
}
