package com.example.backend.Controllers;


import com.example.backend.Models.People;
import com.example.backend.Services.PeopleService;
import com.example.backend.dto.PeopleDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@Slf4j
@CrossOrigin(value = "*", allowedHeaders = "*")

public class PeopleController {

    private final PeopleService peopleService;

    @PostMapping(value = "/addPeople")
    public ResponseEntity<People> addPeople(@RequestBody PeopleDto people) {
        log.info("People Successfully Added.");
        return new ResponseEntity<>(peopleService.save(people), HttpStatus.CREATED);
    }

    @GetMapping(value = "/getPeople")
    public ResponseEntity <List<People>> getPeople() {
        log.info("People Successfully Retrieved.");
        return new ResponseEntity<>(peopleService.getAllPeople(), HttpStatus.OK);
    }

//    @RequestMapping(value = "/getPeople/{id}")
//    public People getPeople(@PathVariable Long id) {
//        log.info("People Successfully Retrieved.");
//        return peopleService.getPeople(id);
//    }

    @DeleteMapping(value = "/deletePeople/{id}")
    public People deletePeople(@PathVariable Long id) {
        log.info("People Successfully Deleted.");
        return peopleService.deletePeople(id);
    }

}
