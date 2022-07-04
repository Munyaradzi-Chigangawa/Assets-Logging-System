package com.example.backend.Controllers;


import com.example.backend.Models.Laptop;
import com.example.backend.Services.LaptopService;
import com.example.backend.dto.LaptopDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@CrossOrigin(value = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class LaptopController {

    private final LaptopService laptopService;

    @PostMapping(value = "/addLaptop")
    public ResponseEntity<Laptop> addLaptop(@RequestBody LaptopDto laptop) {
        log.info("Laptop Successfully Added.");
        return new ResponseEntity<>(laptopService.save(laptop), HttpStatus.CREATED);
    }


    @RequestMapping(value = "/getLaptops")
    public ResponseEntity<List<Laptop>> getLaptops() {
        log.info("Laptops Successfully Retrieved.");
        return new ResponseEntity<>(laptopService.getAllLaptops(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getLaptop/{id}")
    public ResponseEntity<Laptop> getLaptop(@PathVariable Long id) {
        log.info("Laptop Successfully Retrieved.");
        return new ResponseEntity<>(laptopService.getLaptop(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteLaptop/{id}")
    public ResponseEntity<Laptop> deleteLaptop(@PathVariable Long id) {
        log.info("Laptop Successfully Deleted.");
        return new ResponseEntity<>(laptopService.deleteLaptop(id), HttpStatus.OK);
    }



}
