package com.springrest.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired   // use to create object by automatically  
	private CourseService courseService;
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return this.courseService.getCourses();
	}
	
	//get the specific course by id
	@GetMapping("/courses/{courseId}")
	public Course getCourseById(@PathVariable String courseId) {  // path of variable id;
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	//add course
	@PostMapping("/courses")
	public Course AddCourse(@RequestBody Course course) {  // data sent over the request body into an object 
		return this.courseService.addCourse1(course);
	}
	
	// update courses
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse1(course);
	}
	
	// delete a specific course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.courseService.deleteCourse1(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
