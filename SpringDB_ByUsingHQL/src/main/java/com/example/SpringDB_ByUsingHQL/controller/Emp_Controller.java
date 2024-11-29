package com.example.SpringDB_ByUsingHQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.SpringDB_ByUsingHQL.entity.Employee;
import com.example.SpringDB_ByUsingHQL.service.Emp_Service;

@RestController
@RequestMapping("/emp")
public class Emp_Controller {

    @Autowired
    Emp_Service service;

    @PostMapping("/insert")
    public String insert(@RequestBody Employee e) {
        return service.insert(e);
    }

    @DeleteMapping("/delete/{emp_id}")
    public String delete(@PathVariable int emp_id) {
        return service.delete(emp_id);
    }

    @PutMapping("/update/{emp_id}")
    public String update(@RequestBody Employee e, @PathVariable int emp_id) {
        return service.update(e, emp_id);
    }

    @GetMapping("/{emp_id}")
    public Employee getSingleRecord(@PathVariable int emp_id) {
        return service.getSingleRecord(emp_id);
    }

    @GetMapping("/all")
    public List<Employee> fetchAllData() {
        return service.fetchAllData();
    }
}
