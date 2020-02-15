package com.cg.ems.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.ems.bean.Employee;
import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeedaoJdbcImpl;
import com.cg.ems.exception.EmployeeException;

class TestEmployeeDaoJdbcImpl {

	@Test
	public void testFindEmployeeByIdExist() throws Exception
	{
		EmployeeDao dao=new EmployeedaoJdbcImpl();
		Employee employee = dao.findEmployeeById(1060);
		//assertNotNull(employee);
		assertEquals(1060,employee.getEmployeeId());
		
		
		
	}
	@Test
	public void testFindEmployeeByIdNotExist()
	{
		EmployeeDao dao=new EmployeedaoJdbcImpl();
		
				assertThrows(EmployeeException.class,()->dao.findEmployeeById(9000));
				
		
		
	}
	
	
}
