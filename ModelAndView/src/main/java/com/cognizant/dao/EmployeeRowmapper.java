package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Employee;

public class EmployeeRowmapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setId(rs.getString(1));
		e.setFirstname(rs.getString(2));
		e.setLastname(rs.getString(3));
		e.setSalary(rs.getString(4));
		return e;
	}
	

}
