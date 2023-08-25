package com.amdocs.MyFirstSpringProject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.MyFirstSpringProject.dao.EmployeeDAO;
import com.amdocs.MyFirstSpringProject.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDAO employeedao;

	public EmployeeRestController(EmployeeDAO employeedao) {
//		super();
		this.employeedao = employeedao;
	}
	
	@GetMapping("/employees")
	
	public List<Employee> findAll()
	{
		return employeedao.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee findById(@PathVariable int employeeId)
	{
		Employee employee=employeedao.findById(employeeId);
		return employee;
	} }
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee)
	{
		Employee employee=employeedao.save(theEmployee);
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee)
	{
		Employee employee=employeedao.save(theEmployee);
		return employee;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public void deleteById(@PathVariable int employeeId)
	{
		employeedao.deleteById(employeeId);
	}
	
   }
