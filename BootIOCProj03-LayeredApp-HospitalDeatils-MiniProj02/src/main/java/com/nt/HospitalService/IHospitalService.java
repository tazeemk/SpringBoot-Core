package com.nt.HospitalService;

import java.util.List;

import com.nt.Model.HospitalBean;

public interface IHospitalService 
{
public List<HospitalBean> getService(String input1 ,String input2,String input3)throws Exception;
}
