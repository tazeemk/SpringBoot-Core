package com.nt.ModelLayer;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data

public class Student 
{


	private String sname;
	private String sdept;
	private String saddr;
	private int mnum;
	
}
