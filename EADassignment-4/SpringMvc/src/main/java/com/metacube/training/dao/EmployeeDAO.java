package com.metacube.training.dao;

import java.util.List;

import com.metacube.training.model.Employee;

public interface EmployeeDAO {

	public boolean add(Employee employee);

	public Employee get(Integer id);

	public boolean update(Employee employee);

	public List<Employee> getAll();

	public boolean delete(Integer id);
	
	public List<Employee> searchBy(String searchEmployeeBy, String EmployeeInfo);
}