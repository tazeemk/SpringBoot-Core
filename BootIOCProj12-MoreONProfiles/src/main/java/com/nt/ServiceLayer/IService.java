package com.nt.ServiceLayer;

import java.util.List;

import com.nt.ModelLayer.Student;

public interface IService 
{

	public int oraData(Student su)throws Exception;
   public List<Student>getOutput(Student data)throws Exception;	
}
