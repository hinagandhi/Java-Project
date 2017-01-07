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
@Table(name = "ResearchExperienceTable")
public class researchExperience {
	private int researchId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "researchExperienceId")
	public int getResearchId() {
		return researchId;
	}

	public void setResearchId(int researchId) {
		this.researchId = researchId;
	}

	private Faculty facultyResearchExp;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FacultyId")
	public Faculty getFacultyResearchExp() {
		return facultyResearchExp;
	}

	public void setFacultyResearchExp(Faculty facultyResearchExp) {
		this.facultyResearchExp = facultyResearchExp;
	}

	@Column(name = "ResearchArea")
	public String getReserachArea() {
		return reserachArea;
	}

	public void setReserachArea(String reserachArea) {
		this.reserachArea = reserachArea;
	}

	@Column(name = "publication")
	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	private String reserachArea;

	private String publication;

}
