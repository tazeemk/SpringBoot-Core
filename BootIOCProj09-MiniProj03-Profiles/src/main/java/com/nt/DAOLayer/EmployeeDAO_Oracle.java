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

import com.nt.ModelLayer.Employee;

@Repository("empOraDAO")
@Profile({"uat","prod"})
public class EmployeeDAO_Oracle implements IDAOLayer
{
	private static final String Qinput="SELECT ENAME,JOB,SAL FROM EMP1 WHERE EMPNO=(?)";
	private static final String Empins="INSERT INTO EMP1(EMPNO,ENAME,JOB,SAL,HIREDATE)VALUES(EMPNO_SEQ1.NEXTVAL,?,?,?,?)";
	@Autowired
	private DataSource ds;
	@Override
	public List<Employee> viewEmp(int input1) throws Exception {
List<Employee>list =null;
try(Connection con =ds.getConnection();
		PreparedStatement ps=con.prepareStatement(Qinput)){
	ps.setInt(1, input1);
	try(ResultSet rs= ps.executeQuery()){
		list = new ArrayList<Employee>();
		while(rs.next()){
			Employee emp = new Employee();
			emp.setEmpName(rs.getString(1));
			emp.setEmpJob(rs.getString(2));
			emp.setEmpSal(rs.getDouble(3));
			list.add(emp);
		}
		
	}
}catch(SQLException se) {
	se.printStackTrace();
	throw se;
	
}catch(Exception e) {
	e.printStackTrace();
	throw e;
	
}

		return list;
	}
	@Override
	public int insertEmp(Employee emp) throws Exception {
		int k=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps =con.prepareStatement(Empins))
		{
		ps.setString(1, emp.getEmpName());
		ps.setString(2, emp.getEmpJob());
		ps.setDouble(3, emp.getEmpSal());
		ps.setString(4, emp.getHdate());
		k=ps.executeUpdate();
			
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return k;
	}

	
	
}
