package com.nt.HospitalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.Model.HospitalBean;

@Repository("dao")
public class HospitalDao implements IHospitalDao
{
private final static String Qinput="SELECT PIN_NO,H_NAME,D_NAME,STATE FROM HOSPITAL WHERE LOC IN (?,?,?)";
@Autowired
private DataSource ds;
@Override	
public List<HospitalBean> getlocation(String input1,String input2,String input3) throws Exception
{
	List<HospitalBean>list =null;
	try(Connection con =ds.getConnection();
			PreparedStatement ps =con.prepareStatement(Qinput)){
		
		ps.setString(1, input1);
		ps.setString(2, input2);
		ps.setString(3, input3);
		try(ResultSet rs = ps.executeQuery())
		{
			list = new ArrayList<HospitalBean>();
			while(rs.next()) {
		HospitalBean hb = new HospitalBean();
		hb.setPinNo(rs.getInt(1));
		hb.setHName(rs.getString(2));
		hb.setDName(rs.getString(3));
		hb.setSTate(rs.getString(4));
		list.add(hb);
		      	}//end of while loop
		}//2nd try block
		
	}//1st try block
	catch(SQLException se) {
		System.out.println("Some DB problem :");
		se.printStackTrace();
		throw se;
	}catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
	
	
	return list;
}
	
}
