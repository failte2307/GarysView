package com.smbcgroup.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.smbcgroup.object.EmployeeTest;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
 @RequestMapping(value = "/failte/")
public class FailteController {
	
	@RequestMapping(method =  RequestMethod.GET)
	public String getHomepage() {
		return "index";
	}
	
	@RequestMapping(method =  RequestMethod.GET, produces="application/json", value="/getemployee")
	@ResponseBody	
	public List<EmployeeTest> getAllEmployee(){
		
		EmployeeTest bla = new EmployeeTest();
		bla.setName("Mark");
		List <EmployeeTest> employeeList = new ArrayList<>();
		employeeList.add(bla);
		return employeeList;
	}
	

}