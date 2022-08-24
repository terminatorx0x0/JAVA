package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.req.ProjectDetailReq;

@Repository
public interface ProjectRepo extends JpaRepository<ProjectDetailReq, Integer> {

}
