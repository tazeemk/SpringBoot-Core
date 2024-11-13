package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("omg")
public class WeekMessageGenerator
{
     @Autowired
	private LocalDate lt;
	
     public String getWeek() {
    	 
    	 int week =lt.getDayOfWeek().getValue();
    	 if(week==1&&week==7) 
    		return "Enjoy Your Weekend :";
    	 else
    		 return "Work Day :";
     }
     
     
}
