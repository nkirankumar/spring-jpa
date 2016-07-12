package com.my.pack.dao;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.my.pack.model.Category;
import com.my.pack.model.Employee;
import com.my.pack.model.EmployeeVo;
import com.my.pack.model.Stock;
import com.my.pack.model.StockCategory;

@Repository
@Transactional
public class ComplexDaoImpl extends BaseDaoImpl implements ComplexDao{

	@Override
	public EmployeeVo createEmployee(EmployeeVo empVo) {
		// TODO Auto-generated method stub
		System.out.println("name"+empVo.getEname());
		Employee employee=new Employee();
		employee.setEname(empVo.getEname());
		employee.setDeg(empVo.getDeg());
		employee.setSalary(empVo.getSalary());
		employee.setDocument(empVo.getDocument());
		 BufferedOutputStream stream=null;
		try {
			stream = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Kiran\\Desktop\\docs\\nap.xlsx")));
			try {
				stream.write(empVo.getDocument());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
		getEm().persist(employee);
		return empVo;
	}

	@Override
	public String stockToCategoryMapping() {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
	    stock.setStockCode("7052");
	    stock.setStockName("PADINI");
	 
	    Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
	    //new category, need save to get the id first
	    getEm().persist(category1);
	 
	    StockCategory stockCategory = new StockCategory();
	    stockCategory.setStock(stock);
	    stockCategory.setCategory(category1);
	    stockCategory.setCreatedDate(new Date()); //extra column
	    stockCategory.setCreatedBy("system"); //extra column
	 
	    stock.getStockCategories().add(stockCategory);
	 
	    getEm().persist(stock);
		return "Stock to category mapping done";
	}

}
