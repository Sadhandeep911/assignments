package com.task.assignment.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String title;
	private String businessUnit;
	private String place;
	private String supervisorId;
	private String competencies;
	private double salary;

	public Employee() {
	}

	public Employee(int empId, String empName, String title, String businessUnit, String place, String supervisorId,
			String competencies, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.title = title;
		this.businessUnit = businessUnit;
		this.place = place;
		this.supervisorId = supervisorId;
		this.competencies = competencies;
		this.salary = salary;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getCompetencies() {
		return competencies;
	}

	public void setCompetencies(String competencies) {
		this.competencies = competencies;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", title=" + title + ", businessUnit="
				+ businessUnit + ", place=" + place + ", supervisorId=" + supervisorId + ", competencies="
				+ competencies + ", salary=" + salary + "]";
	}

}
