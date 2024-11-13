package com.nt.DAOLayer;

import java.util.List;

import com.nt.ModelLayer.Employee;

public interface IDAOLayer 
{

	public List<Employee>viewEmp(int input1)throws Exception;
	public int insertEmp(Employee emp)throws Exception;
	public int UpdateEmp(Employee emp)throws Exception; 
}
