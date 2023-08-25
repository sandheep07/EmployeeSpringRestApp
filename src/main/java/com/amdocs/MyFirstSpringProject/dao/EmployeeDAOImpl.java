package com.amdocs.MyFirstSpringProject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.amdocs.MyFirstSpringProject.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;

	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Transactional
	@Override
	public List<Employee> findAll()
	{
			
			Session currentSession = 
					entityManager.unwrap(Session.class);
			Query<Employee> theQuery = 
					currentSession.createQuery("From Employee",Employee.class);
			List<Employee> employees = theQuery.getResultList();
			//System.out.println(employees);
			return employees;
		
	} 
	
	@Override
	@Transactional
	public Employee findById(int id)
	{
		Session currentSession = 
				entityManager.unwrap(Session.class);
		Employee employee = 
				currentSession.get(Employee.class,id);
		return employee;
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		Session currentSession = 
				entityManager.unwrap(Session.class);
		
				currentSession.saveOrUpdate(theEmployee);
		return theEmployee;
	}
	
	@Override
	@Transactional
	public void deleteById(int theId)
	{
		Session currentSession = 
				entityManager.unwrap(Session.class);
		Query<Employee> theQuery = 
				currentSession.createQuery("delete From Employee where id=:empId");
		theQuery.setParameter("empId", theId);
		theQuery.executeUpdate();
	}
		

   }
