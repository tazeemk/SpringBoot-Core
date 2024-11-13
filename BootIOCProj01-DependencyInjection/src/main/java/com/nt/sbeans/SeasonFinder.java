package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder
{
	
	
	
     public SeasonFinder() {
		System.out.println("SeasonFinder:0 param constructor :");
	}

	@Autowired //field Injection
	private LocalDate ldate;
     
     public String getSeason() {
    	 
    	 System.out.println("SeasonFinder.getSeason()");
    	 //get the date object 
    	 int month = ldate.getMonthValue();
    	 if(month>3&&month<6) 
    	 return "Summer Season";
    	 else if(month>6&&month<9)
    		 return "Rainy Season";
    	 else
    		 return "Winter Season";
     }
     
}
