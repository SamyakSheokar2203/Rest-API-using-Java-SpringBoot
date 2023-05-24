package com.springrest.springrest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
//	this course list is for temporary data storage without any database only for practice purpose, for that reason i commented out.
//	List<Course> list;
	
	
//	Here we are using courseDao database 
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(145, "java core Course", "this course basics of java"));
//		list.add(new Course(4343, "springs boot course", "creating rest api using spring boot"));
	}
	

   @Override
   public List<Course> getCourses(){ 
	   return courseDao.findAll();   
//   	   return list;
   }


   @Override
   public Course getCourse(long courseId) {
	   
//	   Course c = null;
//	   for(Course course:list) {
//		   if(course.getId() == courseId) {
//			   c = course;  
//		   }
//	   } 
//	   return c;
	   
	   return courseDao.getOne(courseId);
    }


	@Override
	public Course addCourse1(Course course) {
//		list.add(course);
		
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse1(Course course) {
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse1(long courseId) {
//		for(Course course:list) {
//			if(course.getId()== courseId) {
//				list.remove(course);
//			}
//		}
		
		Course entity = courseDao.getOne(courseId); 
		courseDao.delete(entity);
	}

   
   }
