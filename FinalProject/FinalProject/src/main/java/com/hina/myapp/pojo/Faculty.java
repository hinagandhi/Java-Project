package com.hina.myapp.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FacultyTable")
public class Faculty{
	private int facultyId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String accountStatus;
	private Set<Education> education; 
	private Set<industrialExperience> industrialexperience;
	private Set<researchExperience> researchExperience;
	private Set<teachingExperience> teachingExperience;
	private Set<Subjects> subjects;
	private Set<Batch> batch;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="facultyEducation")
	public Set<Education> getEducation() {
		return education;
	}

	public void setEducation(Set<Education> education) {
		this.education = education;
	}
	@OneToMany(fetch=FetchType.LAZY, mappedBy="facultyIndExp")
	public Set<industrialExperience> getIndustrialexperience() {
		return industrialexperience;
	}

	public void setIndustrialexperience(Set<industrialExperience> industrialexperience) {
		this.industrialexperience = industrialexperience;
	}
	@OneToMany(fetch=FetchType.LAZY, mappedBy="facultyResearchExp")
	public Set<researchExperience> getResearchExperience() {
		return researchExperience;
	}

	public void setResearchExperience(Set<researchExperience> researchExperience) {
		this.researchExperience = researchExperience;
	}
	@OneToMany(fetch=FetchType.LAZY, mappedBy="facultyTeachingExp")
	public Set<teachingExperience> getTeachingExperience() {
		return teachingExperience;
	}

	public void setTeachingExperience(Set<teachingExperience> teachingExperience) {
		this.teachingExperience = teachingExperience;
	}
    @OneToMany(cascade = CascadeType.ALL, mappedBy="faculty")
	public Set<Subjects> getSubjects() {
		return subjects;
	}
    
	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}
    
	@OneToMany(fetch=FetchType.LAZY, mappedBy="faculty")
	public Set<Batch> getBatch() {
		return batch;
	}

	public void setBatch(Set<Batch> batch) {
		this.batch = batch;
	}

	
 /*   private MultipartFile photo; 
  // @Column(name = "photoPath")
	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}*/

	@Column(name = "accountStatus")
	public String getAccountStatus() {
		return accountStatus;	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Id
	@Column(name = "facultyId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	@Column(name = "firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
