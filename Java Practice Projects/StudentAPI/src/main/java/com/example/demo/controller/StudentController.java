package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.req.StudentDetailReq;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService ref;

	@GetMapping("/getstudentdetail")
	public ResponseEntity<List<StudentDetailReq>> getStudentDetail(){
		
		return ResponseEntity.ok(ref.getallstudentdetail());
		
	}
	@PostMapping("/savestudentdetail")
	public void saveStudentDetail(@RequestBody StudentDetailReq req){
		
		ref.saveStudentDetail(req);
		
	}
	@DeleteMapping("/deletestudentdetail/{id}")
	public void deleteStudentDetail(@PathVariable int id) {
		
		ref.deleteStudentDetail(id);
	}
	@PutMapping("/updatestudentdetail/{id}")
	public void updateStudentDetail(@PathVariable int id, @RequestBody StudentDetailReq req) {
		
		ref.updateStudent(id,req);
	}
	@GetMapping("/getstudentbydept/{dept}")
	public ResponseEntity<List<StudentDetailReq>> getStudentByDept(@PathVariable String dept){
		return ResponseEntity.ok(ref.getStudentDetailByDept(dept));
		
	}
}
