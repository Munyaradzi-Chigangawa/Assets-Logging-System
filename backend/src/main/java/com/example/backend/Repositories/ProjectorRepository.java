package com.example.backend.Repositories;

import com.example.backend.Models.Projector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectorRepository extends JpaRepository <Projector, Long> {
    List<Projector> findAll();

}
