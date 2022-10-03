package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PeopleDto implements Serializable {

    @NotEmpty(message = "Name is Required.")
    private String name;
    @NotEmpty(message = "Department is Required.")
    private String department;
    @NotEmpty(message = "Designation is Required.")
    private String designation;
    @NotEmpty(message = "Phone is Required.")
    private String phone;
    @NotEmpty(message = "Email is Required.")
    private String email;
    @NotEmpty(message = "Password is Required.")
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
