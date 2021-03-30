package com.spjdbc.jdbcdao.controller;

import com.spjdbc.jdbcdao.dao.EmployeeDao;
import com.spjdbc.jdbcdao.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/getemployees")
    public List<Employee> getEmp(){
        return employeeDao.getEmployeeList();
    }
}
