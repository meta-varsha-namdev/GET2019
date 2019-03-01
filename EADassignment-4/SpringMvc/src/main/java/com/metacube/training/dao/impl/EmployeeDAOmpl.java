package com.metacube.training.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.metacube.training.dao.EmployeeDAO;
import com.metacube.training.mapper.EmployeeMapper;
import com.metacube.training.model.Employee;

@Repository
public class EmployeeDAOmpl implements EmployeeDAO {

private JdbcTemplate jdbcTemplate;
	
private final String SQL_FIND_PROJECT = "select * from employee_info where id = ?";
private final String SQL_DELETE_PROJECT = "delete from employee_info where id = ?";
private final String SQL_UPDATE_PROJECT = "update employee_info set firstName = ?, lastName = ?, email  = ?, contactNo = ? where id = ?";
private final String SQL_GET_ALL = "select * from employee_info";
private final String SQL_INSERT_PROJECT = "insert into employee_info(firstName, lastName, email, contactNo) values(?,?,?,?)";


	@Autowired
	public EmployeeDAOmpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean add(Employee employee) {
		
		return jdbcTemplate.update(SQL_INSERT_PROJECT, employee.getfirstName(), employee.getlastName(), employee.getEmail(),
				employee.getContact()) > 0;
	}

	public Employee get(Integer id) {
		return jdbcTemplate.queryForObject(SQL_FIND_PROJECT, new Object[] { id }, new EmployeeMapper());
	}

	public boolean update(Employee employee) {
		return jdbcTemplate.update(SQL_UPDATE_PROJECT, employee.getfirstName(), employee.getlastName(), employee.getEmail(),
				employee.getContact(),employee.getId()) > 0;
	}

	public List<Employee> getAll() {
		return jdbcTemplate.query(SQL_GET_ALL, new EmployeeMapper());
	}

	public boolean delete(Integer id) {
		return jdbcTemplate.update(SQL_DELETE_PROJECT, id) > 0;
	}
	
	public  List<Employee> searchBy(String searchEmployeeBy,String EmployeeInfo) {
		String SQL_SEARCH = "select * from employee_info where "+searchEmployeeBy+" = "+"\""+ EmployeeInfo +"\"";
		return jdbcTemplate.query(SQL_SEARCH,new EmployeeMapper());
	}
}