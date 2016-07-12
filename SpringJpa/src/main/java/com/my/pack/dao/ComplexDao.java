package com.my.pack.dao;

import com.my.pack.model.EmployeeVo;

public interface ComplexDao {
	EmployeeVo createEmployee(EmployeeVo empVo);
	String stockToCategoryMapping();
}
