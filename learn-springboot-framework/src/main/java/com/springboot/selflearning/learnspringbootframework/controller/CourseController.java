package com.springboot.selflearning.learnspringbootframework.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.selflearning.learnspringbootframework.controller.model.Course;

@RestController
public class CourseController {
	
//	[{
//		"id":1,
//		"name": "Learn AWS",
//		"author": "in28minutes"
//	}]
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		System.out.println("Inside Controller");
		return Arrays.asList(
				new Course(1,"Learn AWS","in 28minutes"),
				new Course(2,"Learn Azure1","in 28minutes"),
				new Course(3,"Learn DevOps","in 28minutes")
				);
	}

}
