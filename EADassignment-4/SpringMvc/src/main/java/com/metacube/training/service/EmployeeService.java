package com.metacube.training.service;

import java.util.List;

import com.metacube.training.model.Employee;

public interface EmployeeService {
	
	public boolean add(Employee employee);
	
	public Employee get(Integer id);
	
	public boolean update(Employee employee);
	
	public List<Employee> getAll();
	
	public boolean delete(Integer id);
	
	public List<Employee> searchBy(String searchEmployeeBy, String EmployeeInfo);
}