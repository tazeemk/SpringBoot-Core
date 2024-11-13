package com.nt.sbeans;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix = "emp.data")
public class EmployeeDetails
{

	private int empid;
	private String ename;
	private String deptno;
	List<String>color;
	
	Set<String>mafia;
	
}
