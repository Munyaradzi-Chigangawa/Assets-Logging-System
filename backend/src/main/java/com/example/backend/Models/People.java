package com.example.backend.Models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "people")
public class People {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100, name = "people_id")
    private Long peopleId;
    @Column(columnDefinition = "varchar(255)")
    private String name;
    private String department;
    private String designation;
    private String phone;
    private String email;
    private String Password;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}


