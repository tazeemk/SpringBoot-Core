package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.ControllerLayer.EmpController;
import com.nt.ModelLayer.Employee;

@SpringBootApplication
public class BootIocProj04LayeredAppMiniProj03MysqlOracleApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=  SpringApplication.run(BootIocProj04LayeredAppMiniProj03MysqlOracleApplication.class, args);
	EmpController e =ctx.getBean("empCon",EmpController.class);
	/*============================================================
	 *   ************************INSERT OPERATION ************************************
	 * Employee emp = new Employee(); Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter Employee Name:"); String ename= sc.nextLine();
	 * System.out.println("Enter Employee Desgn :"); String job = sc.nextLine();
	 * System.out.println("Enter Employee Sal :"); double sal =
	 * Double.parseDouble(sc.nextLine());
	 * 
	 * emp.setEmpName(ename); emp.setEmpJob(job); emp.setEmpSal(sal);
	 */
/*	try {
		
		List<Employee>list=e.viewEmp(input1);
		list.forEach(data->System.out.println(data));
		
	}catch(Exception m){
		m.printStackTrace();
		System.out.println("Some DB Problem Please Contact Devang johnny sins : ");
	}

}*/
	
	
	System.out.println("======================================");
	System.out.println("********UPDATE OPERATION**************");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Employee Name :");
	String ename = sc.nextLine();
	System.out.println("Enter Employee Job :");
	String job = sc.nextLine();
	System.out.println("Enter Employee Number To Update The Record :");
	int empno = sc.nextInt();
	Employee emp = new Employee();
	emp.setEmpName(ename);
	emp.setEmpJob(job);
	emp.setEmpNo(empno);
	try {
		String result =e.updateRecord(emp);
		System.out.println(result);
		
		
	}catch(Exception m ) {
		m.printStackTrace();
		System.out.println("Some DB Problem :");
	}
	}
}
