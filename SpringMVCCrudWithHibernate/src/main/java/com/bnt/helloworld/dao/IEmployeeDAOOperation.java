package com.bnt.helloworld.dao;

import java.util.List;

import com.bnt.helloworld.entity.EmployeeEntity;

public interface IEmployeeDAOOperation {
	
	public List<EmployeeEntity> getAllEmployeeDetails();
	
	public Boolean insertEmployeeDetails(EmployeeEntity employeeEntity);
	
	public void deleteEmployee(Integer employeeId);

	public EmployeeEntity getEmployeeDetail(Integer employeeId);
	
	public  Boolean updateEmployeeDetails(EmployeeEntity employee);
}
