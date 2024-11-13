package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.HospitalController.HospitalController;
import com.nt.Model.HospitalBean;

@SpringBootApplication
public class BootIocProj04LayeredAppHospitalDeatilsMiniProj02Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootIocProj04LayeredAppHospitalDeatilsMiniProj02Application.class, args);
	
	HospitalController hc = ctx.getBean("con",HospitalController.class);
	Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first Input :");
     String input1=sc.nextLine();
     System.out.println("Enter the second Input :");
     String input2 = sc.nextLine();
     System.out.println("Enter the third Input :");
     String input3 = sc.nextLine();
	
	try {
	  List<HospitalBean>list=hc.getDetail(input1, input2, input3);
	list.forEach(data->System.out.println(data));
		
	}catch(Exception e) {
		System.out.println("Internal Problem :");
		e.printStackTrace();
	}

         ((ConfigurableApplicationContext) ctx).close();
	}
}