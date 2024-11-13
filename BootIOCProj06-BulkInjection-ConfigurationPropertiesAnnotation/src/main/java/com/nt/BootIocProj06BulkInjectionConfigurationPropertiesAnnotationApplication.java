package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.Company;

@SpringBootApplication
@PropertySource("file.properties")
public class BootIocProj06BulkInjectionConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
	//get the IOC Container 
		ApplicationContext ctx	=SpringApplication.run(BootIocProj06BulkInjectionConfigurationPropertiesAnnotationApplication.class, args);
	//Get the Spring bean obj
		Company company = ctx.getBean("comp",Company.class);
		
		System.out.println(company);
	
	
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
