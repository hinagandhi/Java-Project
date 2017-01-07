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
@Table(name = "TeachingExperienceTable")
public class teachingExperience {
	private int teachingId;
	private Faculty facultyTeachingExp;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FacultId")
	public Faculty getFacultyTeachingExp() {
		return facultyTeachingExp;
	}

	public void setFacultyTeachingExp(Faculty facultyTeachingExp) {
		this.facultyTeachingExp = facultyTeachingExp;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teachingExperienceId")
	public int getTeachingId() {
		return teachingId;
	}

	public void setTeachingId(int teachingId) {
		this.teachingId = teachingId;
	}

	private String instituitionName;
	private String position;

	@Column(name = "InstituitionName")
	public String getInstituitionName() {
		return instituitionName;
	}

	public void setInstituitionName(String instituitionName) {
		this.instituitionName = instituitionName;
	}

	@Column(name = "Position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
