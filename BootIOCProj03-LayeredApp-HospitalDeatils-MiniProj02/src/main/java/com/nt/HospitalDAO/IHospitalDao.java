package com.nt.HospitalDAO;

import java.util.List;

import com.nt.Model.HospitalBean;

public interface IHospitalDao
{

	public List<HospitalBean> getlocation(String input1,String input2,String input3)throws Exception;
	
}
