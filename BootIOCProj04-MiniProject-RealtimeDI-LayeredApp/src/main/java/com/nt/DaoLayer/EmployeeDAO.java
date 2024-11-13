package com.nt.DaoLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.ModelLayer.Employee;

@Repository("DAO")
public class EmployeeDAO implements IEmployeeDao
{
	private static final String Qinput="SELECT EMPNO,ENAME,JOB,SAL,HIREDATE FROM EMP1 WHERE JOB IN(?,?,?)";
	@Autowired
	private DataSource ds;
	

	
	public List<Employee> getDetails(String input1,String input2,String input3)throws Exception
	{
		List<Employee>list =null;
	try(Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(Qinput);
			){
		ps.setString(1, input1);
		ps.setString(2, input2);
		ps.setString(3, input3);
		
try(ResultSet rs = ps.executeQuery()){
    list =	new ArrayList<Employee>();
	while(rs.next()){
		Employee emp = new Employee();
		emp.setEmpNo(rs.getInt(1));
		emp.setEName(rs.getString(2));
		emp.setJob(rs.getString(3));
		emp.setSal(rs.getDouble(4));
		emp.setHdate(rs.getString(5));
		list.add(emp);
      }//while loop close 
	
}//try2 close
	}//try1 close
	catch(SQLException se) 
	{
		System.out.println("DB problem : Wrong Input ");
		throw se;
	}
	catch(Exception e) {
		System.out.println("Some Unknown Problem :");
		throw e;
	}
	
	return list;
	}

	int k=0;
	  private static final String INSERT_EMPLOYEE="INSERT INTO EMP1(EMPNO,ENAME,JOB,SAL,HIREDATE) VALUES(EMPNO_SEQ1.NEXTVAL,?,?,?,?)";
	@Override
	public int insertEmployee(Employee emp) throws Exception {
		
	 try(Connection con=ds.getConnection();
			 PreparedStatement ps =con.prepareStatement(INSERT_EMPLOYEE);)
	 {
	
		 ps.setString(1, emp.getEName());
		 ps.setString(2, emp.getJob());
		 ps.setDouble(3, emp.getSal());
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
