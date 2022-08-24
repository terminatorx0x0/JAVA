 package com.hashcode.employeemngmt.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashcode.employeemngmt.dto.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> findByDeptname(String deptname);
    List<Employee> findByEmpname(String empname);

}
