package com.nt.ControllerLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.ModelLayer.Employee;
import com.nt.ServiceLayer.IEmployeeService;

@Controller("con")
public class EmployeeController {
   @Autowired
	private IEmployeeService ser;
	public List<Employee> controller(String input1,String input2,String input3)throws Exception
	{
		List<Employee>list = ser.getService(input1, input2, input3);
		return list;
		
	}
	
public String employeeRegister(Employee emp) throws Exception 
{
	
	String result =ser.registerEmployee(emp);
return result;
}

}
