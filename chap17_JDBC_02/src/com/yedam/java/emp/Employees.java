package com.yedam.java.emp;

import java.sql.Date;

public class Employees {
	//VO 클래스 - 단순히 정보 저장
	
	//필드
	private int employeeId;
	//_사용하지 않음
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hire_Date;
	private String jobId;
	private double salary;
	private double commisionPct;
	private int managerId;
	public int getEmployeeId() {
		return employeeId;
	}
	//모든 컬럼명이 필드로 대응됨
	//필드는 모두 private
	
	//필드만 toString
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hire_Date=" + hire_Date + ", jobId=" + jobId
				+ ", salary=" + salary + ", commisionPct=" + commisionPct + ", managerId=" + managerId
				+ ", departmentId=" + departmentId + "]";
	}

	//getter, setter
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHire_Date() {
		return hire_Date;
	}
	public void setHire_Date(Date hire_Date) {
		this.hire_Date = hire_Date;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Double getCommisionPct() {
		return commisionPct;
	}
	public void setCommisionPct(double commisionPct) {
		this.commisionPct = commisionPct;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	private int departmentId;
	
}
