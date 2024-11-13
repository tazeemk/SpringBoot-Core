package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WeekMessageGenerator;

@SpringBootApplication
public class BootIocProj01DependencyInjectionAssig2Application
{
	
	
  @Bean(name="mg")
	public LocalDate create() {
		return LocalDate.now();
	}

	public static void main(String[] args) 
	{
	ApplicationContext ctx=	SpringApplication.run(BootIocProj01DependencyInjectionAssig2Application.class, args);
	
	WeekMessageGenerator generator = ctx.getBean("omg",WeekMessageGenerator.class);
	
	String result = generator.getWeek();
	System.out.println("Result :"+result);
	
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
