package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
   @Autowired
	private LocalTime lt;
	
	
	public String getWish() {
		
		int t=lt.getHour();
		if(t<12)
		return"Good Morning :";
		else if(t>12 && t>18)
			return "Good Evening";
		else 
			return "Good Night";
	}
	
}
