package com.oocl.jpa.demo.controller;

import com.oocl.jpa.demo.entity.Company;
import com.oocl.jpa.demo.respository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping("/companies")
    public Company create(@RequestBody Company company){
        return companyRepository.save(company);
    }

    @GetMapping("/companies")
    public List<Company> findAll(){
        return companyRepository.findAll();
    }

    @GetMapping("/companies/{id}")
    public Company findById(@PathVariable int id){
        return companyRepository.findById(id).get();
    }

    @PutMapping("/companies")
    public Company update(@RequestBody Company company){
       return companyRepository.save(company);
    }

    @DeleteMapping("/companies/{id}")
    public List<Company> delete(@RequestBody int id){
        companyRepository.deleteById(id);
        return companyRepository.findAll();
    }

}
