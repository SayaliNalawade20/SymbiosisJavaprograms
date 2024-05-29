package com.JPATest.JPAQuestion1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {

	@Id
	private long Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Department;
	public long getId() {
		return Id;
	}
	public void setId(long id2) {
		Id = id2;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Department=" + Department + "]";
	}
	public Employee(long id, String firstName, String lastName, String email, String department) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId1(long id2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
