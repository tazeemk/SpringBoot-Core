package com.nt.DAOLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.ModelLayer.Student;
@Repository("mysql")
@Profile({"dev","test"})
public class MySQL_DAO implements IDAO 
{
   private static final String INPUT="INSERT INTO STUDENT(SDEPT,SADDR,SMNUM)VALUES (?,?,?)";
  private static final String OUTPUT ="SELECT SDEPT,SADDR,SMNUM FROM STUDENT WHERE SMNUM=?";
   @Autowired
   private DataSource ds;
   
   
   @Override
	public int oracleInsert(Student data) throws Exception {
		int k =0;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(INPUT))
		{
			
		ps.setString(1, data.getSdept());
		ps.setString(2, data.getSaddr());
		ps.setInt(3, data.getMnum());
		k=ps.executeUpdate();
		
		
		}catch(SQLException se ) {
			
			System.out.println("Some Db Problem");
			throw se;
		}catch(Exception e) {
			System.out.println("Problem");
			throw e;
		}
	   
	   
	   
		return k;
	}


@Override
public List<Student> retrive(Student s) throws Exception {
	List<Student>list =null;
	try(Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(OUTPUT))
	{
	    ps.setInt(1, s.getMnum());	
		try(ResultSet rs = ps.executeQuery())
		{
			
		while(rs.next())	{
			list = new ArrayList<Student>();
			Student sa = new Student();
			sa.setSdept(rs.getString(1));
			sa.setSaddr(rs.getString(2));
			sa.setMnum(rs.getInt(3));
			list.add(sa);
			
		}//end of while loop
			
			
		}//end of 2nd try block
		
	}//end of 1st try block
	catch(SQLException se) {
		
		System.out.println("Some db problem :");
	throw se;
	}catch(Exception e) {
		System.out.println("internal");
		throw e;
	}
	
	
	
	return list;
}
   
   
   

}
