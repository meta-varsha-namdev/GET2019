package com.metacube.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.metacube.training.model.Employee;
import com.metacube.training.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model m) {
		m.addAttribute("x",new Employee());
		return "employee/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Employee employee) {
		employeeService.add(employee);
		return "redirect:/employee/all";
	}
	
	@RequestMapping(value = "/edit/{employeeId}", method = RequestMethod.GET)
	public ModelAndView get( @PathVariable("employeeId") Integer employeeId) {
		Employee employee = employeeService.get(employeeId);
		return new ModelAndView("employee/edit", "employee",employee);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Employee employee) {
		employeeService.update(employee);
		return "redirect:/employee/all";
	}
	
	@RequestMapping(value="/search",method = RequestMethod.GET)
	public String search() {
		return "employee/search";
	}
	
	@RequestMapping(value="/searchBy",method = RequestMethod.POST)
	public ModelAndView searchBy(@RequestParam("searchEmployeeBy")String searchEmployeeBy,@RequestParam("EmployeeInfo")String EmployeeInfo) {
		List<Employee> employees = employeeService.searchBy(searchEmployeeBy,EmployeeInfo);
		//first @param "users" which is variable using in all.jsp page
		return new ModelAndView("employee/all", "employees", employees);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<Employee> employees = employeeService.getAll(); 
		return new ModelAndView("employee/all", "employees", employees);
	}
	
	@RequestMapping(value = "/delete/{employeeId}", method = RequestMethod.GET)
	public String delete(@PathVariable("employeeId") Integer employeeId) {
		employeeService.delete(employeeId);
		return "redirect:/employee/all";
	}

}