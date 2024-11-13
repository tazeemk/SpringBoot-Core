package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/Cmfg/ApplicationContext.xml")
public class BootIocProj02LooslyCoupleDependencyInjection01Application {

	public static void main(String[] args) 
	{
		//getting IOC container :
	ApplicationContext ctx=	SpringApplication.run(BootIocProj02LooslyCoupleDependencyInjection01Application.class, args);
	// getting obj reference 
	
	Vehicle v=ctx.getBean("veh",Vehicle.class);
	
	//Calling Business Method 
	v.journey("Jaunpur", "New York");
	
	//closeing Container
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
