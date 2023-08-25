package com.amdocs.MyFirstSpringProject.dao;

import java.util.List;

//import org.springframework.web.bind.annotation.RequestBody;

import com.amdocs.MyFirstSpringProject.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	public Employee findById(int Id);
	public Employee save(Employee theEmployee);
	public void deleteById(int theId);

}
