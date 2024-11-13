package com.nt.ServiceLayer;

import java.util.List;

import com.nt.ModelLayer.Employee;

public interface IService 
{

	public List<Employee> getDeatil(int input1)throws Exception;
	public String setDetail(Employee Emp)throws Exception;
	public String updateDetail(Employee emp)throws Exception;
}
