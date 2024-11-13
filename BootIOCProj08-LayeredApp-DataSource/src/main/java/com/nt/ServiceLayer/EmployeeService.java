package com.nt.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DaoLayer.IEmployeeDao;
import com.nt.ModelLayer.Employee;
@Service("ser")
public class EmployeeService implements IEmployeeService 
{ 
     @Autowired
	private IEmployeeDao dao;
	
public List<Employee> getService(String input1)throws Exception
{
      input1 =	input1.toUpperCase();
	 // input2 =	input2.toUpperCase();
	  //input3 =  input3.toUpperCase();
List<Employee>list =dao.getDetails(input1);
  
	list.sort((t1,t2)->t1.getEName().compareTo(t2.getEName()));;
	list.forEach(data->{
	 
		data.setGsal(data.getSal()+(data.getSal()*5));
		data.setNsal(data.getGsal()+(data.getGsal()*0.2));
		
	    System.out.println("Gross Salary :"+data.getGsal()+" Net Salary :"+data.getNsal());
	    
	});
	
	return list;
}

@Override
public String registerEmployee(Employee emp) throws Exception {
	
	int register =dao.insertEmployee(emp);
	
	return register==0?"Employee not registered :": "Employee Record Registered Successfully : ";
}
	
}
