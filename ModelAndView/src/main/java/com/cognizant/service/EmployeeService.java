package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Employee;

public interface EmployeeService {
	public String insert(Employee e);
    public String delete(Employee e);
    public String update(Employee e);
    public List<Employee> getAll();
}
