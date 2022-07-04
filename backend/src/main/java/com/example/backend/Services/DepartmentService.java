package com.example.backend.Services;


import com.example.backend.Models.Department;
import com.example.backend.Repositories.DepartmentRepository;
import com.example.backend.dto.DepartmentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
