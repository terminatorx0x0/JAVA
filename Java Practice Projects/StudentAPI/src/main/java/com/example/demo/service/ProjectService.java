package com.example.demo.service;

import java.util.List;

import com.example.demo.req.ProjectDetailReq;

public interface ProjectService {

	List<ProjectDetailReq> getAllProjectDetail();

	void addProjectDetail(ProjectDetailReq preq);

	void deleteProjectDetail(int projectid);

	void updateProject(ProjectDetailReq preq);

	ProjectDetailReq getProjectById(int projectid);

}
