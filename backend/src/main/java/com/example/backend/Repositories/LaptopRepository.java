package com.example.backend.Repositories;
import com.example.backend.Models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository <Laptop, Long > {

}
