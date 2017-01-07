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
@Table(name = "industrialExperienceTable")
public class industrialExperience {

	private int industrialId;
	private String industryName;
	private String position;
	private int yearsOfExperience;
	
	@Column(name = "yearsOfIndusExp")
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
    
	private Faculty facultyIndExp;
  
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FacultyId")
	public Faculty getFacultyIndExp() {
		return facultyIndExp;
	}

	public void setFacultyIndExp(Faculty facultyIndExp) {
		this.facultyIndExp = facultyIndExp;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IndustrialExperienceId")
	public int getIndustrialId() {
		return industrialId;
	}

	public void setIndustrialId(int industrialId) {
		this.industrialId = industrialId;
	}

	@Column(name = "IndustryName")
	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	@Column(name = "position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
