package com.tnsif.courseModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.courseModule.entity.Course;
import com.tnsif.courseModule.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	@PostMapping("/course")
	public Course createCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	
	@GetMapping("/courses")
	public List<Course>getAllCourses(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable long id) {
		return courseService.getCourseById(id);
	}
	
	@PutMapping("/course/{id}")
	public Course updateCourse(@PathVariable long id, @RequestBody Course course) {
		return courseService.updateCourse(id,  course);
	}
	
	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable long id) {
		courseService.deleteCourse(id);
	}

}
