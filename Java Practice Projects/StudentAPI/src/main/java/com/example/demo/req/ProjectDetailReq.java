package com.example.demo.req;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProjectDetailReq {
	
	@Id
	private int projectid;
	private String projectname;
    
	@ManyToOne
	private StudentDetailReq student;
}
