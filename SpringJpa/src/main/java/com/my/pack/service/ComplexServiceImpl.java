package com.my.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.pack.dao.ComplexDao;
import com.my.pack.model.EmployeeVo;
@Service("complexService")
public class ComplexServiceImpl implements ComplexService{
	@Autowired
	ComplexDao complexDao;
	@Override
	public EmployeeVo createEmployee(EmployeeVo empVo) {
		// TODO Auto-generated method stub
		return complexDao.createEmployee(empVo);
	}
	@Override
	public String stockToCategoryMapping() {
		// TODO Auto-generated method stub
		return complexDao.stockToCategoryMapping();
	}

}
