package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.ControllerLayer.EmpController;
import com.nt.ModelLayer.Employee;

import jakarta.annotation.Resources;

@SpringBootApplication
@ImportResource("com/nt/Context/ApplicationContext.xml")
public class BootIocProj04LayeredAppMiniProj03MysqlOracleApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=  SpringApplication.run(BootIocProj04LayeredAppMiniProj03MysqlOracleApplication.class, args);
	EmpController e =ctx.getBean("empCon",EmpController.class);
	
	   Employee emp = new Employee(); Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Employee Name:"); 
	  String ename= sc.nextLine();
	  System.out.println("Enter Employee Desgn :");
	  String job = sc.nextLine();
	  System.out.println("Enter Employee Sal :");
	  double sal =sc.nextDouble();
	              sc.nextLine();
	  System.out.println("Enter Employee Hire Date :");
	  String hdate =sc.nextLine();
	  
	  emp.setEmpName(ename); emp.setEmpJob(job); emp.setEmpSal(sal);
	  emp.setHdate(hdate);
	 try {
		 String result = e.getDeatil(emp);
		 System.out.println(result);
		 
	 }catch(Exception m) {
		 m.printStackTrace();
		 System.out.println("Somrthing Wrong in Database :");
	 }
 
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Employee Number :");
	int input1= sc.nextInt();
	
	try {
		
		List<Employee>list=e.viewEmp(input1);
		list.forEach(data->System.out.println(data));
		
	}catch(Exception m){
		m.printStackTrace();
		System.out.println("Some DB Problem Please Contact Devang johnny sins : ");
	}
    
    
	}*/

}
}