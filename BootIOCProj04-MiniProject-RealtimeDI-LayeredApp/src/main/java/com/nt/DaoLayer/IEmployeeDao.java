package com.nt.DaoLayer;

import java.util.List;

import com.nt.ModelLayer.Employee;

public interface IEmployeeDao 
{
public List<Employee> getDetails(String input1,String input2,String input3) throws Exception;
	
public int insertEmployee(Employee emp)throws Exception;
}