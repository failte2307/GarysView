package com.smbcgroup.failte.query;



import java.util.EnumMap;
import java.util.Map;

import com.smbcgroup.failte.exception.EmployeeQueryException;
import com.smbcgroup.failte.exception.ValidatorException;
import com.smbcgroup.failte.validator.EmployeeNameValidator;
import com.smbcgroup.failte.validatorinterface.Validator;

/**
 * @author Mark
 * 15 Jun 2019
 */
public class EmployeeQuery {

	
	private int employeeId;
	
	private int departmentId;
	
	private String employeeName;
	
	private String telephoneNo;
	
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

	public static class Builder{
		private EmployeeQuery query = new EmployeeQuery();
		
		private enum EmployeeParams{
			employeeId, departmentId, employeeName, telephoneNo, email
		};
		
		private Map<EmployeeParams, Validator> validators = new EnumMap<EmployeeParams,Validator>(EmployeeParams.class);
		
		public Builder employeeName(String employeeName) {
			validators.put(EmployeeParams.employeeName, new EmployeeNameValidator(employeeName));
			query.employeeName = employeeName;
			return this;
		}
		
		
		public EmployeeQuery build() {
			for(EmployeeParams param : validators.keySet())
				try {
					validators.get(param).validate();
				}
			catch(ValidatorException e) {
				throw new EmployeeQueryException(param.name(), e);
			}
			return query;
		}
	}
}
