package com.my.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;



import com.my.pack.model.EmployeeVo;
import com.my.pack.service.ComplexService;

@Controller
@RequestMapping(value = "complex")
public class ComplexController {
	@Autowired
	ComplexService complexService;
	@RequestMapping(value="/employee/create",method=RequestMethod.POST,consumes = {"application/*"},produces={"application/*"})
	@ResponseBody
	public EmployeeVo createEmployee(@RequestBody EmployeeVo empVo){
		return complexService.createEmployee(empVo);
	}
	@RequestMapping(value="/stockToCategory",method=RequestMethod.GET)
	@ResponseBody
	public String stockToCategoryMapping(){
		return complexService.stockToCategoryMapping();
	}
	
	

}
