package com.nt.HospitalService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.HospitalDAO.IHospitalDao;
import com.nt.Model.HospitalBean;

@Service("ser")
public class HService implements IHospitalService
{
       @Autowired
	private IHospitalDao dao;
	
       @Override
       public List<HospitalBean> getService(String input1,String input2,String input3)throws Exception
       {
    	   input1=input1.toUpperCase();
    	   input2=input2.toUpperCase();
    	   input3=input3.toUpperCase();
    	   List<HospitalBean>list =dao.getlocation(input1, input2, input3);
    	   list.sort((t1,t2)->t1.getHName().compareTo(t2.getHName()));
    	   
    	   return list;
       }
	
}
