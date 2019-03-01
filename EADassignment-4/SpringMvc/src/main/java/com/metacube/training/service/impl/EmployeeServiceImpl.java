package com.metacube.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metacube.training.dao.EmployeeDAO;
import com.metacube.training.model.Employee;
import com.metacube.training.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public boolean add(Employee employee) {
		return employeeDAO.add(employee);
	}

	public Employee get(Integer id) {
		return employeeDAO.get(id);
	}

	public boolean update(Employee employee) {
		return employeeDAO.update(employee);
	}

	public List<Employee> getAll() {
		return employeeDAO.getAll();
	}

	public boolean delete(Integer id) {
		return employeeDAO.delete(id);
	}
	
	public List<Employee> searchBy(String searchEmployeeBy, String EmployeeInfo) {
		return employeeDAO.searchBy(searchEmployeeBy, EmployeeInfo);
		
	}
}
