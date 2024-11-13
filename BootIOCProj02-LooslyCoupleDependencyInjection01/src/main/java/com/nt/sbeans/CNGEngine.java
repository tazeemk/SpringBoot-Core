package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Cengine")
@Lazy(true)
public final class CNGEngine implements IEngine
{
	public CNGEngine()
	{
		System.out.println("CNGEngine.CNGEngine()");
	}
	public void start() 
	{
	System.out.println("CNGEngine.start() EngineStarted:");	
	}
	public void stop()
	{
		System.out.println("CNGEngine.stop() EngineStopped :");
		
	}
}
