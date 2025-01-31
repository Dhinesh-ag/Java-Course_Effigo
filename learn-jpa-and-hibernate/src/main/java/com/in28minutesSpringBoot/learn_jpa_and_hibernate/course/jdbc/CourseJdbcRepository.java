package com.in28minutesSpringBoot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutesSpringBoot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository 
{
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY= """    
			INSERT INTO COURSE(id, name, author)
			values(?,?,?);
			""";
	
	private static String DELETE_QUERY= """
			delete from course
			where id=?
			
			""";
	public void inser(Course course)
	{
		springJdbcTemplate.update(INSERT_QUERY, 
		  course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id)
	{
		springJdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public Course findById(long id)
	{
		//REsultSet->bean=>Row MApper=>
		return springJdbcTemplate.queryForObject(DELETE_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
		
	}
}
