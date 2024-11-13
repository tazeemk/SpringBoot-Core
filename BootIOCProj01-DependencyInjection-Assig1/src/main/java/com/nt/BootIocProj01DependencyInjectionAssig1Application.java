package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootIocProj01DependencyInjectionAssig1Application 
{
	@Bean(name="lt")
public LocalTime create() {
	return LocalTime.now();
}
	
	
	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootIocProj01DependencyInjectionAssig1Application.class, args);
	WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
	String restult = generator.getWish();
	
	System.out.println("result :"+restult);
	
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
