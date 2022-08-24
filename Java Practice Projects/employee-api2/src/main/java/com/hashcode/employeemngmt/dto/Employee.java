package com.hashcode.employeemngmt.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;

import com.hashcode.employeemngmt.validation.IsValidEmpName;

@Entity
public class Employee {

    @Id
	@GeneratedValue
	
	private int empid;

    @IsValidEmpName
	private String empname;
  
	private String deptname;
	@Past
	private String dob;
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Employee() {
		
	}
	public Employee(int empid, String empname, String deptname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deptname = deptname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
