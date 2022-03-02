package com.test.elasticsearchdemo.Controller;

import com.test.elasticsearchdemo.DTO.EmployerDTO;
import com.test.elasticsearchdemo.Model.Employer;
import com.test.elasticsearchdemo.Service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployerController {

    final EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping("newEmp")
    public ResponseEntity<Employer> addNewEmployer(@RequestBody EmployerDTO employerDTO) {
        Employer employer = employerService.addNewEmp(employerDTO);
        return ResponseEntity.ok(employer);
    }

    @GetMapping("/getEmp/{id}")
    public ResponseEntity<List<Employer>> getEmployer(@PathVariable String id) {
        if (id == null) {
            return new ResponseEntity("ID Not found", HttpStatus.BAD_REQUEST);
        } else {
            return ResponseEntity.ok(employerService.getEmployer(id));
        }
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Employer>> employerList() {
        return ResponseEntity.ok(employerService.getAllEmployers());
    }

}
