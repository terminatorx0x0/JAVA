package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.repo.ProjectRepo;
import com.example.demo.req.ProjectDetailReq;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepo proreporef;

	/*
	 * List<ProjectDetailReq> prolist= new ArrayList( Arrays.asList( new
	 * ProjectDetailReq(1,"Android"), new ProjectDetailReq(2,"API"), new
	 * ProjectDetailReq(3,"DM")));
	 */

	@Override
	public List<ProjectDetailReq> getAllProjectDetail() {
		// TODO Auto-generated method stub
		return proreporef.findAll() ;
	}

	@Override
	public void addProjectDetail(ProjectDetailReq preq) {
		// TODO Auto-generated method stub
		proreporef.save(preq);
	}
	
	@Override
	public void deleteProjectDetail(int projectid) {
		// TODO Auto-generated method stub
		proreporef.deleteById(projectid);
	}

	@Override
	public void updateProject(ProjectDetailReq preq) {
		// TODO Auto-generated method stub
		proreporef.save(preq);
	}

	@Override
	public ProjectDetailReq getProjectById(int projectid) {
		// TODO Auto-generated method stub
		return proreporef.getOne(projectid);
	}
}
