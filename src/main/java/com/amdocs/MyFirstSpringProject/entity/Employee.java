package com.amdocs.MyFirstSpringProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="FIRST_NAME")
	private String first_Name;
	@Column(name="LAST_NAME")
	private String last_Name;
	@Column(name="EMAIL")
	private String email;
	
	public Employee() {
		super();
	}
	public Employee(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.first_Name = firstName;
		this.last_Name = lastName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return first_Name;
	}
	public void setFirstName(String firstName) {
		this.first_Name = firstName;
	}
	public String getLastName() {
		return last_Name;
	}
	public void setLastName(String lastName) {
		this.last_Name = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
