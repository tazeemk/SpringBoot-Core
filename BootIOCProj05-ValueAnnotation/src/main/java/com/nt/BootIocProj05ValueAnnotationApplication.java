package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Patient;

@SpringBootApplication
public class BootIocProj05ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj05ValueAnnotationApplication.class, args);
	
	   Patient patient=ctx.getBean("pa",Patient.class);
	   
	   System.out.println(patient);
	
	
	}

}
