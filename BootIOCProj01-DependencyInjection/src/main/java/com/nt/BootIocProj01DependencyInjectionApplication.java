package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01DependencyInjectionApplication {
	
	
	
	
	
public BootIocProj01DependencyInjectionApplication() {
		System.out.println("BootIocProj01DependencyInjectionApplication: 0 param Constructor :");
	}



	//In springboot configuration ,componenetscan and enableautoconfiguration all are combined in springbootapplication annotation
	@Bean(name="ld")
	public LocalDate create() {
		System.out.println("BootIocProj01DependencyInjectionApplication.create()");
		return LocalDate.now();
	}
	
	
	
	public static void main(String[] args) 
	{  
		System.out.println("BootIocProj01DependencyInjectionApplication.main()===>(start)");
		//getting IOC Container 
	ApplicationContext ctx=	SpringApplication.run(BootIocProj01DependencyInjectionApplication.class, args);
                //get seasonfinder class obj ref	
	
	   SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
	   //Calling BusinessMethod
	   String result=finder.getSeason();
	   System.out.println("result :"+result);
	
	   //their is no direct close()method present in ApplicationContext interface so we need to typecast it 
	   ((ConfigurableApplicationContext) ctx).close();
	   System.out.println("BootIocProj01DependencyInjectionApplication.main()=====>(End)");
	   
	}

}
