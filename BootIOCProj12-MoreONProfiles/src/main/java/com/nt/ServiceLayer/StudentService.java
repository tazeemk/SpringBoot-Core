package com.nt.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAOLayer.IDAO;
import com.nt.ModelLayer.Student;
@Service("ser")
public class StudentService implements IService {

	@Autowired
	private IDAO dao;

	
	@Override
	public int oraData(Student su) throws Exception	
	{
		
		int result = dao.oracleInsert(su);
		
		return result;
	}


	@Override
	public List<Student> getOutput(Student data) throws Exception {
		
		//getting the data from dao class
		
		 List<Student>list = dao.retrive(data);
		
		
		return list;
	}
	
	

	
	
}
