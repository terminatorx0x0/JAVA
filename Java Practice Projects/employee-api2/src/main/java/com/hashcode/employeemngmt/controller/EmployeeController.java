package com.hashcode.employeemngmt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hashcode.employeemngmt.dto.Employee;
import com.hashcode.employeemngmt.service.IEmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	IEmployeeService empServiceRef;
	
@RequestMapping("/welcome")
public String EmployeeController() {
	return "Hello Employee";
	
}
@RequestMapping("/employees")
public List<Employee> getAllEmployees(){
	return empServiceRef.getAllEmployee();
	
	
}
@RequestMapping("/employees/{num}")
public Employee getEmployeeById(@PathVariable("num") int empid) {
	return empServiceRef.getEmployeeById(empid);
	
}
@RequestMapping(method=RequestMethod.POST,value="/employees")
public void addEmployee(@Valid @RequestBody Employee employee) {
	 empServiceRef.addEmployee(employee);
}
@RequestMapping(method=RequestMethod.PUT,value="/employees/{empid}")
public void updateEmployee(@RequestBody Employee employee,@PathVariable int empid) {
	 empServiceRef.updateEmployee(employee,empid);
}
@RequestMapping(method=RequestMethod.DELETE,value="/employees/{empid}")
public void deleteEmployee(@PathVariable int empid) {
	 empServiceRef.deleteEmployee(empid);
}
@RequestMapping("/employees/dept/{deptname}")
public List<Employee> getEmployeeByDeptname(@PathVariable String deptname) {
	return empServiceRef.getEmployeeByDeptname(deptname);
}
@RequestMapping("/employees/name/{empname}")
public List<Employee> getEmployeeByEmpname(@PathVariable String empname) {
	return empServiceRef.getEmployeeByEmpname(empname);
}
}