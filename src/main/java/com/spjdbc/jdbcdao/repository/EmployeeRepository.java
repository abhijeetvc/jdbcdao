package com.spjdbc.jdbcdao.repository;

import com.spjdbc.jdbcdao.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getEmployeeList();
}
