package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Pengine")
@Lazy(true)
public final class PetrolEngine implements IEngine {

	public PetrolEngine()
	{
		System.out.println("PetrolEngine.PetrolEngine()");
	}
	public void start()
	{
		System.out.println("PetrolEngine.start() Engine Started :");
	}
	public void stop() 
	{
	System.out.println("PetrolEngine.stop() Engine Stopped :");	
	}
}
