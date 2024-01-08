
package com.spring.selflearning.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.selflearning.learnspringframework.enterprise.example.service.DataService;

@Component
public class BusinessService{
	
	@Autowired
	public DataService dataService;
	public long calculateSum() {
		List<Integer> data=dataService.getData();
		return data.stream().reduce(Integer::sum).get();
		
	}
}

