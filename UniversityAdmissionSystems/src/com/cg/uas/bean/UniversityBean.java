package com.cg.uas.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

@Entity
@Table(name="Universities")

	@NamedQuery(name="retrieveUniversity",query="SELECT universityName FROM UniversityBean university")

public class UniversityBean {

@Id
@Column(name="university_name")
private String universityName;
@Column(name="university_code")
private String universityCode;

public String getUniversityName() {
	return universityName;
}
public void setUniversityName(String universityName) {
	this.universityName = universityName;
}
public String getUniversityCode() {
	return universityCode;
}
public void setUniversityCode(String universityCode) {
	this.universityCode = universityCode;
}

	

	
}
