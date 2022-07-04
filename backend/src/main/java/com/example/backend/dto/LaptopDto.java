package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LaptopDto implements Serializable {
    @NotEmpty(message = "Laptop Name is Required.")
    private String laptopName;
    @NotEmpty(message = "Laptop Model is Required.")
    private String laptopModel;
    @NotEmpty(message = "Laptop Brand is Required.")
    private String LaptopBrand;
    @NotEmpty(message = "Laptop Serial Number is Required.")
    private String laptopSerialNumber;
    @NotEmpty(message = "Processor is Required.")
    private String processor;
    @NotEmpty(message = "RAM is Required.")
    private String ram;
    @NotEmpty(message = "Storage is Required.")
    private String storage;
    private String createdAt;
    private String updatedAt;

}
