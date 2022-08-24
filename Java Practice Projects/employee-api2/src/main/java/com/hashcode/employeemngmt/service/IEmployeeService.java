package com.hashcode.employeemngmt.service;

import java.util.List;

import com.hashcode.employeemngmt.dto.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployee();
    Employee getEmployeeById(int empid);
    void addEmployee(Employee employee);
	void updateEmployee(Employee employee, int empid);
	void deleteEmployee(int empid);
	List<Employee> getEmployeeByDeptname(String deptname);
	List<Employee> getEmployeeByEmpname(String empname);
  


}
