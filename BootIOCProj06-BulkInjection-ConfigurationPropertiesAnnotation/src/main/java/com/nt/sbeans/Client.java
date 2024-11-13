package com.nt.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("cl")
public class Client 
{
private int cid;
private String cname;
private String cloc;
}
