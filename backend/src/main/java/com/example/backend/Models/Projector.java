package com.example.backend.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projectors")
@Builder
public class Projector implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100)
    private Long id;
    @Column(name = "projector_name", columnDefinition = "varchar(255)")
    private String projectorName;
    private String projectorModel;
    private String projectorNumber;
    @CreationTimestamp
    private String createdAt;
    @UpdateTimestamp
    private String updatedAt;
}

