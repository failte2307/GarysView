package com.smbcgroup.failte.service;

import java.util.List;



import com.smbcgroup.failte.dto.AppointmentDTO;

/**
 * @author Mark
 * 10 Jun 2019
 */
public interface AppointmentService {

	public List<AppointmentDTO> getEmployeesAppointments(int employeeId);

}
