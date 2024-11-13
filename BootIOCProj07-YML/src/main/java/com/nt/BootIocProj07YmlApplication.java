package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.EmployeeDetails;

@SpringBootApplication
public class BootIocProj07YmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj07YmlApplication.class, args);
	
	EmployeeDetails emp = ctx.getBean("emp",EmployeeDetails.class);
	
	System.out.println(emp);
	 ((ConfigurableApplicationContext) ctx).close();
	}

}
