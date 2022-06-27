package com.example.backend.Repositories;
import com.example.backend.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department, String>{
    
}
