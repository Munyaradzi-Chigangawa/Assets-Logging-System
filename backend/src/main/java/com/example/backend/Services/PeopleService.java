package com.example.backend.Services;


import com.example.backend.Models.People;
import com.example.backend.Repositories.PeopleRepository;
import com.example.backend.dto.PeopleDto;
import com.example.backend.exceptions.PersonNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor

public class PeopleService {

    @Autowired
    private final PeopleRepository peopleRepository;

    public People save(PeopleDto people) {
        People people1 = People.builder()
                .name(people.getName())
                .department(people.getDepartment())
                .designation(people.getDesignation())
                .phone(people.getPhone())
                .email(people.getEmail())
                .createdAt(people.getCreatedAt())
                .updatedAt(people.getUpdatedAt())
                .build();
        return peopleRepository.save(people1);
    }

    public List<People> getAllPeople() {
        return peopleRepository.findAll();
    }

    public People getPeople(Long id) {
        return peopleRepository.findById(id)
                .orElseThrow(() -> new PersonNotFound("People id " + id + "was not found"));
    }

    public People deletePeople(Long id) {
        peopleRepository.deleteById(id);
        return null;
    }
}
