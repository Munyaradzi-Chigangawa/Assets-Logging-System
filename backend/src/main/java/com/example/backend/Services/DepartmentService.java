package com.example.backend.Services;


import com.example.backend.Models.Department;
import com.example.backend.Models.Projector;
import com.example.backend.Repositories.DepartmentRepository;
import com.example.backend.dto.DepartmentDto;
import com.example.backend.dto.ProjectorDto;
import com.example.backend.exceptions.DepartmentNotFound;
import com.example.backend.exceptions.ProjectorNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor

public class DepartmentService {
    @Autowired
    private final DepartmentRepository departmentRepository;

    public Department save (DepartmentDto department) {
        Department department1 = Department.builder()
                .departmentName(department.getDepartmentName())
                .departmentCode(department.getDepartmentCode())
                .departmentDescription(department.getDepartmentDescription())
                .createdAt(department.getCreatedAt())
                .updatedAt(department.getUpdatedAt())
                .build();
        return departmentRepository.save(department1);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartment(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new DepartmentNotFound("Department id " + id + "was not found"));
    }

    public Department deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
        return null;
    }

    // Update Department
    public Department updateDepartment (DepartmentDto departmentDto, Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new DepartmentNotFound("No Department Found"));
                department.setDepartmentName(department.getDepartmentName());
                department.setDepartmentCode(department.getDepartmentCode());
                department.setDepartmentDescription(department.getDepartmentDescription());
                department.setCreatedAt(department.getCreatedAt());
                department.setUpdatedAt(department.getUpdatedAt());
        return departmentRepository.save(department);

        }
}
