package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.ControllerLayer.EmployeeController;
import com.nt.ModelLayer.Employee;

@SpringBootApplication
public class BootIocProj04LayeredAppMiniProj01Application {

	public static void main(String[] args) { //
		

		ApplicationContext ctx = SpringApplication.run(BootIocProj04LayeredAppMiniProj01Application.class, args);
		EmployeeController e = ctx.getBean("con", EmployeeController.class);
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter first input:"); String input1 = sc.next();
		  System.out.println("Enter Second input:"); String input2=sc.next();
		  System.out.println("Enter third input:"); String input3=sc.next();
		  
		  try {
			  
			
			 List<Employee> list = e.controller(input1,input2,input3);
		  
		  list.forEach(emp -> {
		  
		  System.out.println(emp); });
		  
		  
		  } catch (Exception m) { m.printStackTrace();
		  System.out.println("invalid input :");
		  
		  }
		 
	
	
		
		/*
		 * Scanner sc = new Scanner(System.in); Employee emp = new Employee();
		 * System.out.println("Enter Employee NAME :"); String name = sc.nextLine();
		 * System.out.println("Enter Employee Designation :"); String job =
		 * sc.nextLine(); System.out.println("Enter Employee Salary :"); double esal =
		 * Double.parseDouble(sc.nextLine());
		 * System.out.println("Enter Employee Date of joining :"); String hdate =
		 * sc.nextLine();
		 * 
		 * emp.setEName(name); emp.setJob(job); emp.setSal(esal); emp.setHdate(hdate);
		 * try { String resu=e.employeeRegister(emp); System.out.println(resu);
		 * 
		 * }catch(Exception e1) { e1.printStackTrace();
		 * System.out.println("Some Internal problem :"); }
		 */
	}

}
