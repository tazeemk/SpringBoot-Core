package com.nt.DAOLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.ModelLayer.Student;

@Repository("oracle")
@Profile({"prod","uat"})
public class Ora_DAO  implements IDAO 
{
private static final String INSERT="INSERT INTO STUDENT VALUES(SQ2.NEXTVAL,?,?,?,?)";
@Autowired
private DataSource ds;

@Override
public int oracleInsert(Student data) throws Exception {
	int k=0;
	try(Connection con =ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT))
	{
       ps.setString(1, data.getSname());
       ps.setString(2, data.getSdept());
       ps.setString(3, data.getSaddr());
       ps.setInt(4, data.getMnum());
		
		k=ps.executeUpdate();
	}catch(SQLException se) {
		System.out.println("DB Problem");
		throw se;
		
	}catch(Exception e) {
		
		System.out.println("Gautam Pelandu");
		throw e;
		
	
	}
	
	
	
	
	return k;
}

@Override
public List<Student> retrive(Student s) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

	
	
}
