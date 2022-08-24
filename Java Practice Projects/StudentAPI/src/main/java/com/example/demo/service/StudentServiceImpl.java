package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.StudentRepo;
import com.example.demo.req.StudentDetailReq;

@Service
public class StudentServiceImpl implements StudentService {
	
	/*
	 * List<StudentDetailReq> stulist= new ArrayList( Arrays.asList( new
	 * StudentDetailReq(1,"Prince","CSE"), new StudentDetailReq(2,"Nikhil","IT"),
	 * new StudentDetailReq(3,"Aman","BSC")));
	 */
	@Autowired
	private StudentRepo reporef;

	@Override
	public List<StudentDetailReq> getallstudentdetail() {
		// TODO Auto-generated method stub
		return reporef.findAll();
	}

	@Override
	public void  saveStudentDetail(StudentDetailReq req) {
		// TODO Auto-generated method stub
		 //stulist.add(req);
		   reporef.save(req);
	}

	@Override
	public void deleteStudentDetail(int id) {
		// TODO Auto-generated method stub
		//stulist.remove(id);
		reporef.deleteById(id);
	}

	@Override
	public void updateStudent(int id, StudentDetailReq req) {
		// TODO Auto-generated method stub
		//stulist.set(id, req);
		reporef.save(req);
	}

	@Override
	public List<StudentDetailReq> getStudentDetailByDept(String dept) {
		// TODO Auto-generated method stub
		return reporef.findBydept(dept);
	}

}