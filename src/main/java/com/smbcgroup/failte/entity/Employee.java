package com.smbcgroup.failte.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.smbcgroup.failte.dto.EmployeeDTO;


/**
 * @author Mark
 * 22 May 2019
 */
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name = "Employee_Id")
	private int employeeId;
	
	@Column(name = "Department_Id")
	private int departmentId;
	
	@Column(name = "Employee_Name")
	private String employeeName;
	
	@Column(name = "Tel_Number")
	private String telephoneNo;
	
	@Column(name = "E_Mail")
	private String email;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Employee() {
		
		
	}
	
	public Employee (EmployeeDTO dto) {
		this.employeeId = dto.getEmployeeId();
		this.departmentId = dto.getDepartmentId();
		this.employeeName = dto.getEmployeeName();
		this.telephoneNo = dto.getTelephoneNo();
		this.email = dto.getEmail();
	}

}
