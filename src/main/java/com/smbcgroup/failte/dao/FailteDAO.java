package com.smbcgroup.failte.dao;

import java.util.List;


import com.smbcgroup.failte.dto.EmployeeDTO;
import com.smbcgroup.failte.query.EmployeeQuery;

/**
 * @author Mark
 * 22 May 2019
 */
public interface FailteDAO {
	
	
	
	public List<EmployeeDTO> getEmployees();
	public List<EmployeeDTO> getSearchedEmployees(EmployeeQuery query);
	public void createEmployee (EmployeeDTO employee);
	public List<EmployeeDTO> deleteEmployee(int employeeId);
}
