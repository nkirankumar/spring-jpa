package com.my.pack.service;

import com.my.pack.model.EmployeeVo;

public interface ComplexService {
	EmployeeVo createEmployee(EmployeeVo empVo);
	String stockToCategoryMapping();

}
