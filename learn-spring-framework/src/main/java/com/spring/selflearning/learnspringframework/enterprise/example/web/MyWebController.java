package com.spring.selflearning.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.selflearning.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	
	@Autowired
	BusinessService businessService;
	
	public long returnValueFromBusinessService() {
	return businessService.calculateSum();
}

}
