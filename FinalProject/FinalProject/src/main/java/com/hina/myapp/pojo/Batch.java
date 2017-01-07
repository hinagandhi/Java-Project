package com.hina.myapp.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "BatchTable")
public class Batch {
	private int batchId;
	private String subjectName;
	
	@Column(name="SubjectName")
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
		
	private Set<Students> students;
	private Faculty faculty;
	private Students student;
	@Transient
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	@Id
	@Column(name = "batchId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	
	@ManyToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinTable(name = "students_batch", joinColumns = { 
			@JoinColumn(name = "batchId" )}, 
			inverseJoinColumns = { @JoinColumn(name = "studentId", 
					nullable = true, updatable = true) })
	public Set<Students> getStudents() {
		return students;
	}
	public void setStudents(Set<Students> students) {
		this.students = students;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FacultyId")
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
