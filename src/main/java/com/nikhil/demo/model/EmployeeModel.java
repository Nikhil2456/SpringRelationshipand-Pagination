package com.nikhil.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EmployeeModel {
@Id
@GeneratedValue
private int empId;

private String fullName;
private String jobTitle;
private String personalPhoneNumber;
private String email;
private String address;
private String city;
private String state;
@OneToMany(targetEntity=primaryEmergencyContactModel.class,cascade=CascadeType.ALL)
private List<primaryEmergencyContactModel> primary=new ArrayList<primaryEmergencyContactModel>();
@OneToMany(targetEntity=primaryEmergencyContactModel.class,cascade=CascadeType.ALL)
private List<primaryEmergencyContactModel> secondary=new ArrayList<primaryEmergencyContactModel>();
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public String getPersonalPhoneNumber() {
	return personalPhoneNumber;
}
public void setPersonalPhoneNumber(String personalPhoneNumber) {
	this.personalPhoneNumber = personalPhoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public List<primaryEmergencyContactModel> getPrimary() {
	return primary;
}
public void setPrimary(List<primaryEmergencyContactModel> primary) {
	this.primary = primary;
}
public List<primaryEmergencyContactModel> getSecondary() {
	return secondary;
}
public void setSecondary(List<primaryEmergencyContactModel> secondary) {
	this.secondary = secondary;
}
@Override
public String toString() {
	return "EmployeeModel [EmpId=" + empId + ", fullName=" + fullName + ", jobTitle=" + jobTitle
			+ ", personalPhoneNumber=" + personalPhoneNumber + ", email=" + email + ", address=" + address + ", city="
			+ city + ", state=" + state + ", primary=" + primary	 + ", secondary=" + secondary + "]";
}


}
