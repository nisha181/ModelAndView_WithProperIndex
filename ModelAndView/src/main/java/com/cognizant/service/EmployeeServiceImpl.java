package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.EmployeeDao;
import com.cognizant.dao.EmployeeDaoImpl;
import com.cognizant.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao emp=new EmployeeDaoImpl();

	public String insert(Employee e) {
		return emp.insert(e);
	}

	public String delete(Employee e) {
		return emp.delete(e);
	}

	public String update(Employee e) {
		return emp.update(e);
	}

	public List<Employee> getAll() {
		return emp.getAll();
	}

}
