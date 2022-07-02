package com.example.backend.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProjectorDto implements Serializable {
    @NotEmpty(message = "Projector Name is Required.")
    private String projector_name;
    @NotEmpty(message = "Projector Model is Required.")
    private String projector_model;
    @NotEmpty(message = "Projector Serial Number is Required.")
    private String projector_number;
    private Date createdAt;
    private Date updatedAt;

}
