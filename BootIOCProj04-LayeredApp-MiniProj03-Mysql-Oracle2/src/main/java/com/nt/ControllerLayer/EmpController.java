package com.nt.ControllerLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.ModelLayer.Employee;
import com.nt.ServiceLayer.IService;

@Controller("empCon")
public class EmpController 
{
	@Autowired
    private IService is;
	
	public List<Employee> viewEmp(int input1) throws Exception
	{
		
		List<Employee>list=is.getDeatil( input1);
		
		return list;
	}
	
	
	
	public String getDeatil(Employee emp)throws Exception
	{
		
		 String re = is.setDetail(emp); 
		
		return re;
	}
	public String updateRecord(Employee emp)throws Exception  {
		String det =is.updateDetail(emp);
		return det;
		
	}
	
	
}
