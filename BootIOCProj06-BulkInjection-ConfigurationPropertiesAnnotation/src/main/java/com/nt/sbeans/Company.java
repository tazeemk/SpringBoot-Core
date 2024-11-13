package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("comp")
@ConfigurationProperties(prefix = "org.nit")
public class Company 
{
	@Value("${com.regno}")
private Double cRegNo;
private String cname;
private String location;
private String ctype;

private List<String> color;
private Set<String>names;
private String[] loc;
private Map<String,Double>phno;

@Autowired
private Client c;


//Value Annotataion
@Value("${com.weapon}")
private String weapon;
@Value("${com.n1}")
private int num1;
@Value("${com.n1}")
private int num2;

//@Value("#{comp.num1+comp.num2}")
//private int sum;

}
