package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pa")
@Data
public class Patient
{
    @Value("39")
	private int page;
    @Value("${pat.pname}")
  private String pName;
    @Value("${pat.padd}")
    private String pAddr;
    @Value("${os.name}")
    private String osName;
    
	/*
	 * @Value("${Path}") private String pathName;
	 */
    
  //  @Value("#{dcc.xrayRate+dcc.ctscanRate}")
   // private double billAmount;
}
