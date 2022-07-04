package com.example.backend.Repositories;
import com.example.backend.Models.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
