package com.hashcode.employeemngmt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashcode.employeemngmt.DAO.IEmployeeDao;
import com.hashcode.employeemngmt.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	List<Employee> emplist = new ArrayList<>(Arrays.asList(
			new Employee(1, "Prince", "Payments"),
			new Employee(2, "Nikhil", "Clerks"), 
			new Employee(3, "Vivek", "Development")));
    @Autowired
	private IEmployeeDao daoRef;

	@Override
	public List<Employee> getAllEmployee() {
		// return emplist;
		return daoRef.findAll();
	}

	@Override
	public Employee getEmployeeById(int empid) {
		// return emplist.stream().filter(e -> e.getEmpid() == empid).findFirst().get();
		return daoRef.getOne(empid);
	}

	@Override
	public void addEmployee(Employee employee) {
		// emplist.add(employee);
		daoRef.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee, int empid) {
		/*
		 * for(int i=0;i<emplist.size();i++) { Employee e=emplist.get(i); if
		 * (e.getEmpid()==empid) { emplist.set(i, employee); return;
		 * 
		 * } }
		 */
		daoRef.save(employee);
	}

	@Override
	public void deleteEmployee(int empid) {
		//emplist.removeIf(e -> e.getEmpid() == empid);
        daoRef.deleteById(empid);
	}

	@Override
	public List<Employee> getEmployeeByDeptname(String deptname) {
		return daoRef.findByDeptname(deptname);
		
	}
	@Override
	public List<Employee> getEmployeeByEmpname(String empname) {
		return daoRef.findByEmpname(empname);
	}

}
