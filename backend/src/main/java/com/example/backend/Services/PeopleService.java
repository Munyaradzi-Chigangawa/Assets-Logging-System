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

//    Save People
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

//    Get All People
    public List<People> getAllPeople() {

        return peopleRepository.findAll();
    }

//    Get People ById

    public People findById(Long peopleId) {
        return peopleRepository.findById(peopleId)
                .orElseThrow(() -> new PersonNotFound("People id " + peopleId + " was not found"));
    }
// Hameno
    public People getPerson(Long id) {
        return peopleRepository.findById(id)
                .orElseThrow(() -> new PersonNotFound("People id " + id + " was not found"));
    }

    public People deletePeople(Long peopleId) {
        peopleRepository.deleteById(peopleId);
        return null;
    }

//     Update Person
    public People updatePerson (PeopleDto peopleDto, Long id) {
        People people = peopleRepository.findById(id)
                .orElseThrow(() -> new PersonNotFound("Person Not Found"));
                people.setName(peopleDto.getName());
                people.setDepartment(peopleDto.getDepartment());
                people.setDesignation(peopleDto.getDesignation());
                people.setPhone(peopleDto.getPhone());
                people.setEmail(peopleDto.getEmail());
                people.setCreatedAt(peopleDto.getCreatedAt());
                people.setUpdatedAt(peopleDto.getUpdatedAt());
        return peopleRepository.save(people);
    }
}
