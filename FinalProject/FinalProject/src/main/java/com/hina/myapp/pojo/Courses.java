package com.hina.myapp.pojo;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CoursesTable")
@Inheritance(strategy=InheritanceType.JOINED) 
public class Courses {
	private String courseName;
	private int courseId;
	private Set<Subjects> subjects;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="courses")
	public Set<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}
	@Id
    @Column(name = "CourseId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Column(name="CourseName")
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
