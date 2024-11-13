package com.nt.ControllerLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.ModelLayer.Student;
import com.nt.ServiceLayer.StudentService;

@Controller("con")
public class StudentController 
{
@Autowired
private	StudentService service ;
	
	public int getUpdate(Student control)throws Exception
	{
		int s = service.oraData(control);
		
		return s;
	}
	
	
	public List<Student> output(Student data)throws Exception
	{
		
	    List<Student>list = service.getOutput(data);
	    		
		
		return list;
	}
	
}
