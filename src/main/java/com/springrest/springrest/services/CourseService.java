package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse1(Course course);
	
	public Course updateCourse1(Course course);
	
	public void deleteCourse1(long courseId);
}
