package com.example.SpringDB_ByUsingHQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDB_ByUsingHQL.dao.Emp_Dao;
import com.example.SpringDB_ByUsingHQL.entity.Employee;

@Service
public class Emp_Service {

    @Autowired
    Emp_Dao dao;

    public String insert(Employee e) {
        return dao.insert(e);
    }

    public String delete(int emp_id) {
        return dao.delete(emp_id);
    }

    public String update(Employee e, int emp_id) {
        return dao.update(e, emp_id);
    }

    public Employee getSingleRecord(int emp_id) {
        return dao.getSingleRecord(emp_id);
    }

    public List<Employee> fetchAllData() {
        return dao.fetchAllData();
    }
}
