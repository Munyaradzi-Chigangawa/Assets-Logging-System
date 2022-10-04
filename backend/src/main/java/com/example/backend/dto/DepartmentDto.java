package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class DepartmentDto implements Serializable {
    @NotEmpty(message = "Department Name is Required.")
    private String departmentName;
    @NotEmpty(message = "Department Code is Required.")
    private String departmentCode;
    @NotEmpty(message = "Department Description is Required.")
    private String departmentDescription;
    private Date createdAt;
    private Date updatedAt;
}
