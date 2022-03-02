package com.test.elasticsearchdemo.Service;

import com.test.elasticsearchdemo.DTO.EmployerDTO;
import com.test.elasticsearchdemo.Model.Employer;
import com.test.elasticsearchdemo.Repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {


    final EmployerRepository employerRepository;

    @Autowired
    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }


    public Employer addNewEmp(EmployerDTO employerDTO) {
        Employer employer = new Employer(employerDTO.getId(), employerDTO.getFirstName(), employerDTO.getLastName(), employerDTO.getAge());
        return employerRepository.save(employer);
    }

    public List<Employer> getAllEmployers() {
        return employerRepository.findAll();
    }

    public List<Employer> getEmployer(String id) {
        return employerRepository.findAllById(id);
    }
}
