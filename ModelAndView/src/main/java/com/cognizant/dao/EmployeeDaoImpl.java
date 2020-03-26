package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	
	@Autowired
	private JdbcTemplate jt;
	public String insert(Employee e) {
		int result=jt.update("insert into Employees values(?,?,?,?)",e.getId(),e.getFirstname(),e.getLastname(),e.getSalary());
		if(result==1)
			return "SUCCESS";
		else
			return "FAIL";
		
	}
	public String delete(Employee e) {
		int result=jt.update("delete from Employees where id=?",e.getId());
		if(result!=0)
			return "SUCCESS";
		else
			return "FAIL";
	}

	public String update(Employee e) {
		int result=jt.update("update Employees set first_name=?,last_name=?,salary=? where id=?",e.getFirstname(),e.getLastname(),e.getSalary(),e.getId());
		if(result!=0)
			return "SUCCESS";
		else
			return "FAIL";
	}

	

	public List<Employee> getAll() {
		String sql="select * from Employees";
		EmployeeRowmapper er=new EmployeeRowmapper();
		List<Employee> list=jt.query(sql, er);
		return list;
	}

}
