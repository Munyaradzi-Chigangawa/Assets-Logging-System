package com.example.backend.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto implements Serializable {
    @NotEmpty(message = "Asset Name is Required.")
    private String assetName;
    @NotEmpty(message = "Borrowed By is Required.")
    private String borrowedBy;
    @NotEmpty(message = "Serial Number is Required.")
    private String serialNumber;
    @NotEmpty(message = "Borrowed Date is Required.")
    private Date borrowedDate;
    @NotEmpty(message = "Return Date is Required.")
    private Date returnDate;
    @NotEmpty(message = "Model is Required.")
    private String model;
//    @NotEmpty(message = "Quantity is Required.")
//    private String quantity;
    @NotEmpty(message = "Status is Required.")
    private String status;
    private Date createdAt;
    private Date updatedAt;

}
