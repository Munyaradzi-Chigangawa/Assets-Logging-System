package com.example.backend.dto;
import lombok.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProjectorDto implements Serializable {
    @NotEmpty(message = "Projector Name is Required.")
    private String projectorName;
    @NotEmpty(message = "Projector Model is Required.")
    private String projectorModel;
    @NotEmpty(message = "Projector Serial Number is Required.")
    private String projectorSerialNumber;
    @NotEmpty(message = "Projector Status is Required.")
    private String projectorStatus;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
