package com.in28minutesSpringBoot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutesSpringBoot.learn_jpa_and_hibernate.course.Course;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner
{
	@Autowired
    private CourseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception 
	{
	   repository.inser(new Course(1, "learn AWS", "In28min"));
	   repository.inser(new Course(2, "learn Azure", "In28min"));
	   repository.inser(new Course(3, "learn amazon", "In28min"));
	   repository.inser(new Course(4, "learn ec2", "In28min"));
	   repository.inser(new Course(5, "learn kubernates", "In28min"));
		
	   repository.deleteById(1);
	   System.out.println(repository.findById(2));
	   System.out.println(repository.findById(3));
	}

}
