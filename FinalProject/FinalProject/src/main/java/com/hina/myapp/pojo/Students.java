package com.hina.myapp.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StudentTable")
@Inheritance(strategy=InheritanceType.JOINED)
public class Students  {
	private int studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Set<Batch> batch;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy="students")
	public Set<Batch> getBatch() {
		return batch;
	}
	public void setBatch(Set<Batch> batch) {
		this.batch = batch;
	}
	@Id
	@Column(name = "StudentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Column(name="FirstName")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="LasttName")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name="Email")
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="Password")
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
