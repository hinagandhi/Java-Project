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
@Table(name = "SubjectsTable")
public class Subjects {
	private int subjectId;
	private String subjectName;
	private Faculty faculty;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Faculty_Id")
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	private Courses courses;
	private int courseDuration;
	private String levelType;
	
	@Column(name="LevelType")
	public String getLevelType() {
		return levelType;
	}
	public void setLevelType(String levelType) {
		this.levelType = levelType;
	}
	@Column(name="CourseDuration")
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CoursesId")
	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	@Id
	@Column(name = "SubjectId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	@Column(name = "SubjectName")
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
    
	
}
