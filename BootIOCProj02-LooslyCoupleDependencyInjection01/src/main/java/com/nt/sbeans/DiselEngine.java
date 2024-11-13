package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Dengine")
@Lazy(true)
public final class DiselEngine implements IEngine {

	public  DiselEngine()
	{
		System.out.println("DiselEngine.DiselEngine()");
	}
	public void start()
	{
		System.out.println("DiselEngine.start() Engine Started :");
	}
	public void stop() {
		System.out.println("DiselEngine.stop() Engine Stopped :");
	}
}
