package com.nt.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.DAOLayer.IDAOLayer;
import com.nt.ModelLayer.Employee;
@Service("empSer")
public class EmpService implements IService {
    @Autowired
	private IDAOLayer idl;
	
	@Override
	public List<Employee> getDeatil(int input1) throws Exception {
		 List<Employee>list = idl.viewEmp(input1);
		
		return list;
	}

	@Override
	public String setDetail(Employee Emp) throws Exception 
	{
		
		 int retriveve=idl.insertEmp(Emp);
		
		return retriveve ==0?"Record not inserted:":"Record Inseretd Succcessfully....";
	}

	@Override
	public String updateDetail(Employee emp) throws Exception {
		int ret=idl.UpdateEmp(emp);
		return ret==0?"Record Not Update :":"Record Updateded Sucessfully..";
	}

}
