package com.hina.myapp.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "educationTable")
public class Education {
	private int educationId;

	@Id
	@Column(name = "educationId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	private String degree;
	private String college;
	private String country;
	private String majors;

	@Column(name = "Majors")
	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	private Faculty facultyEducation;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Faculty_Id")
	public Faculty getFacultyEducation() {
		return facultyEducation;
	}

	public void setFacultyEducation(Faculty facultyEducation) {
		this.facultyEducation = facultyEducation;
	}

	@Column(name = "Degree")
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "college")
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Column(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
