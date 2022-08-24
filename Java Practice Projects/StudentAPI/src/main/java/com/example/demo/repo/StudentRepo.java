package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.req.StudentDetailReq;

@Repository
public interface StudentRepo extends JpaRepository<StudentDetailReq, Integer> {

	List<StudentDetailReq> findBydept(String dept);
}
