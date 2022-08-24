package com.example.demo.service;

import java.util.List;

import com.example.demo.req.StudentDetailReq;

public interface StudentService  {
	
	List<StudentDetailReq> getallstudentdetail();

	void saveStudentDetail(StudentDetailReq req);

	void deleteStudentDetail(int id);

	void updateStudent(int id, StudentDetailReq req);

	List<StudentDetailReq> getStudentDetailByDept(String dept);


}
