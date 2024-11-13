package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("dcc")
@Data
public class DiagonasticCataloge
{
     @Value("${dc.xrayRate}")
	private double xrayPrice;
	@Value("${dc.2dxrayRate}")
     private double _2dxrayPrice;
     @Value("${dc.mriRate}")
     private double mriPrice;
     @Value("${dc.ctscanRate}")
     private double ctscanPrice;
     @Value("${dc.ecgRate}")
     private double ecgPrice;
	
}
