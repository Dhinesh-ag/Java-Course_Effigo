package com.in28minutesSpringBoot.learnSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController 
{
	
	@RequestMapping("/courses")
	public List<Course>retrieveAllcourses()
	{
		return Arrays.asList(
				    new Course(1, "Learn AWS", "in28min"),
				    new Course(2, "learn devops", "in28min"),
				    new Course(3, "LEarn azure", "in28minutes"),
				    new Course(3, "LEarn azure", "in28minutes")
				);
				
				
				
	}
	

}
