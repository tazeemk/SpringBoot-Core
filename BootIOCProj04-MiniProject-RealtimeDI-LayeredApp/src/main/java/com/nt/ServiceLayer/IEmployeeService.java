package com.nt.ServiceLayer;

import java.util.List;

import com.nt.ModelLayer.Employee;

public interface IEmployeeService 
{
public List<Employee> getService(String input1,String input2,String input3)throws Exception;

public String registerEmployee(Employee emp)throws Exception;
}
