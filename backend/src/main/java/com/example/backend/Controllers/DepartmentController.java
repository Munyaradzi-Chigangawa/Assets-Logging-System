package com.example.backend.Controllers;
import com.example.backend.Models.Department;
import com.example.backend.Services.DepartmentService;
import com.example.backend.dto.DepartmentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@Slf4j

public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping( value = "/addDepartment")
    public ResponseEntity<Department> addDepartment (@RequestBody DepartmentDto department) {
        log.info("Department Successfully Added.");
        return new ResponseEntity<>(departmentService.save(department), HttpStatus.CREATED);
    }

    @GetMapping( value = "/getDepartments")
    public ResponseEntity<List<Department>> getDepartments() {
        log.info("Departments Successfully Retrieved.");
        return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
    }

    @GetMapping( value = "/getDepartment/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long id) {
        log.info("Department Successfully Retrieved.");
        return new ResponseEntity<>(departmentService.getDepartment(id), HttpStatus.OK);
    }

    @DeleteMapping( value = "/deleteDepartment/{id}")
    public ResponseEntity<Department> deleteDepartment(@PathVariable Long id) {
        log.info("Department Successfully Deleted.");
        return new ResponseEntity<>(departmentService.deleteDepartment(id), HttpStatus.OK);
    }

//    @PutMapping( value = "/updateDepartment/{id}")
//    public ResponseEntity<Department> updateDepartment(@PathVariable Long id, @RequestBody DepartmentDto department) {
//        log.info("Department Successfully Updated.");
//        return new ResponseEntity<>(departmentService.updateDepartment(id, department), HttpStatus.OK);
//    }
}
