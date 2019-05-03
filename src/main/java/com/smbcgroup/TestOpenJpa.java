package com.smbcgroup;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import com.smbcgroup.entity.Employee;
public class TestOpenJpa {
	

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Employee> getEmployees(){
		List<Employee> employeeList = entityManager.createQuery("Select e from Employee e").getResultList();
		System.out.println(employeeList);
		return employeeList;
		
	
	}
}
