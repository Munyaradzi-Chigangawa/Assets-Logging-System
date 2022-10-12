package com.example.backend.Controllers;
import com.example.backend.Models.People;
import com.example.backend.Services.PeopleService;
import com.example.backend.dto.PeopleDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

//    Add People
    @PostMapping(value = "/add-people")
    public ResponseEntity<People> addPeople(@RequestBody PeopleDto people) {
        log.info("People Successfully Added.");
        return new ResponseEntity<>(peopleService.save(people), HttpStatus.CREATED);
    }

// Get All people
    @GetMapping(value = "/get-people")
    public ResponseEntity <List<People>> getPeople() {
        log.info("People Successfully Retrieved.");
        return new ResponseEntity<>(peopleService.getAllPeople(), HttpStatus.OK);
    }


// Delete Person
    @DeleteMapping(value = "/delete-person/{id}")
    public People deletePeople(@PathVariable Long id) {
        log.info("People Successfully Deleted.");
        return peopleService.deletePeople(id);
    }

//    Get Person ById
    @GetMapping( value = "/get-person/{id}")
    public ResponseEntity<People> getPerson(@PathVariable Long id) {
        log.info("Department Successfully Retrieved.");
        return new ResponseEntity<>(peopleService.getPerson(id), HttpStatus.OK);
    }

//    Update Person
    @PutMapping( value = "/update-person/{id}")
    public ResponseEntity<People> updatePerson(@PathVariable Long id, @RequestBody PeopleDto people) {
        log.info("Department Successfully Updated.");
        return new ResponseEntity<>(peopleService.updatePerson(people, id), HttpStatus.OK);
    }

}
