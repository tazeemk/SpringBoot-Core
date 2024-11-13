package com.nt.HospitalController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.HospitalService.IHospitalService;
import com.nt.Model.HospitalBean;

@Controller("con")
public class HospitalController 
{
@Autowired
	private IHospitalService ihs;
	
public List<HospitalBean> getDetail(String input1,String input2,String input3)throws Exception{
	List<HospitalBean>list=ihs.getService(input1, input2, input3);
	
	return list;
}

}
