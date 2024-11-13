package com.nt.DAOLayer;

import java.util.List;

import com.nt.ModelLayer.Student;

public interface IDAO 
{

	public int oracleInsert(Student data)throws Exception;
	
	public List<Student>retrive(Student s)throws Exception;
}
