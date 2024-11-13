package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("veh")
public class Vehicle
{
    @Autowired
    @Qualifier("motor")
	private IEngine engine;
	
	public void journey(String des,String sou) 
	{
	System.out.println("Vehicle.journey() Journey Started:");
	                      
	System.out.println("Vehicle.journey()  Started :"+des);
	 engine.start();
	System.out.println("Jounery Is Going On :");
	
	System.out.println("Dstination is arrivad :"+sou);
	engine.stop();
		
	}
}
