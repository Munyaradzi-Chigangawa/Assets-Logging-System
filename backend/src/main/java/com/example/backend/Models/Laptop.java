package com.example.backend.Models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "laptops")

public class Laptop implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100)
    private Long laptopId;
    @Column(name = "laptop_name", columnDefinition = "varchar(255)")
    private String laptopName;
    private String laptopModel;
    private String LaptopBrand;
    private String laptopSerialNumber;
    private String processor;
    private String ram;
    private String storage;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
}
