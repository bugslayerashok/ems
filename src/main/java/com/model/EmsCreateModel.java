package com.model;

import java.util.List;

public class EmsCreateModel {
	private int empId; 
	private String empName; 
	private String empDob; 
	private String empGender; 
	private String empAddress; 
	private long empPhoneNumber; 
	private double empSalary; 
	private String empJoinDate; 
	private int empHours; 
	private int depId;
	private int skillId[];
	private List<DepartmentModel> departments;
	private List<SkillsModel> skills;
	public List<DepartmentModel> getDepartments() {
		return departments;
	}
	public void setDepartments(List<DepartmentModel> departments) {
		this.departments = departments;
	}
	public List<SkillsModel> getSkills() {
		return skills;
	}
	public void setSkills(List<SkillsModel> skills) {
		this.skills = skills;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public long getEmpPhoneNumber() {
		return empPhoneNumber;
	}
	public void setEmpPhoneNumber(long empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(String empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	public int getEmpHours() {
		return empHours;
	}
	public void setEmpHours(int empHours) {
		this.empHours = empHours;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public int[] getSkillId() {
		return skillId;
	}
	public void setSkillId(int[] skillId) {
		this.skillId = skillId;
	}
}
