package com.springrest.springrest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145, "java core Course", "this course basics of java"));
		list.add(new Course(4343, "springs boot course", "creating rest api using spring boot"));
	}
	

   @Override
   public List<Course> getCourses(){
   	   return list;
   }


   @Override
   public Course getCourse(long courseId) {
	   
	   Course c = null;
	   for(Course course:list) {
		   if(course.getId() == courseId) {
			   c = course;  
		   }
	   } 
	   return c;
    }


	@Override
	public Course addCourse1(Course course) {
		list.add(course);
		return course;
	}


	@Override
	public Course updateCourse1(Course course) {
		list.forEach(e -> {
			if (e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}


	@Override
	public void deleteCourse1(long courseId) {
		for(Course course:list) {
			if(course.getId()== courseId) {
				list.remove(course);
			}
		}
	}

   
   }
