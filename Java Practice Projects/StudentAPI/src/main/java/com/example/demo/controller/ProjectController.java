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

import com.example.demo.req.ProjectDetailReq;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService pref;

	@GetMapping("/getprojectdetail")
	public ResponseEntity<List<ProjectDetailReq>> getProject(){
		return ResponseEntity.ok(pref.getAllProjectDetail()) ;
		
	}
	
	@PostMapping("/addproject")
	public void addProject(@RequestBody ProjectDetailReq preq) {

		pref.addProjectDetail(preq);
	}
	
	@DeleteMapping("/deleteprojectdetail/{projectid}")
	public void delProject(@PathVariable int projectid) {

		pref.deleteProjectDetail(projectid);
	}
	@PutMapping("/updateprojectdetail")
	public void updateProject(@RequestBody ProjectDetailReq preq ) {
		
		pref.updateProject(preq);
	}
	@GetMapping("/getprojectbyid/{projectid}")
	public ResponseEntity<ProjectDetailReq> getProject(@PathVariable int projectid){
		return ResponseEntity.ok(pref.getProjectById(projectid));
		
	}
}

