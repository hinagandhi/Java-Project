package com.hina.myapp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "HighSchoolStudentTable")
@PrimaryKeyJoinColumn(name="StudentId")
public class HighSchoolStudents extends Students {
	private String studentType;

	@Column(name="StudentType")
	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}	
}
