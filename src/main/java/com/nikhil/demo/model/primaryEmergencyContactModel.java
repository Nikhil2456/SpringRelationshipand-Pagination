package com.nikhil.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class primaryEmergencyContactModel {
@Id
@GeneratedValue
private int pId;
private String name;
private String phoneNumber;
private String relationship;

@ManyToOne
private EmployeeModel empmodel;

public EmployeeModel getEmpmodel() {
	return empmodel;
}
public void setEmpmodel(EmployeeModel empmodel) {
	this.empmodel = empmodel;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getRelationship() {
	return relationship;
}
public void setRelationship(String relationship) {
	this.relationship = relationship;
}
@Override
public String toString() {
	return "primaryEmergencyContactModel [pId=" + pId + ", name=" + name + ", phoneNumber=" + phoneNumber
			+ ", relationship=" + relationship + "]";
}

}
