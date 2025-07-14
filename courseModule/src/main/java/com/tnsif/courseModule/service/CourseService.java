package com.tnsif.courseModule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.courseModule.entity.Course;
import com.tnsif.courseModule.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	// To save the record(inserting)
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
	
	// To retrive all records
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	// To get specific record
	public Course getCourseById(long id) {
		return courseRepository.findById(id).orElse(null);
	}
	
	// To update Record
	public Course updateCourse(long id, Course course) {
		// to fetch existing record by id
		Course existingCourse=courseRepository.findById(id).orElse(null);
		
		// if course exists, update its fields
		if(existingCourse !=null) {
			existingCourse.setName(course.getName());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setInstructor(course.getInstructor());
			existingCourse.setPrice(course.getPrice());
			return courseRepository.save(existingCourse);	
		}
		
		// if course didn't exist, return null
		return null;
	}
	
	// delete course by id
	public void deleteCourse(long id) {
		 courseRepository.deleteById(id);
	}

}
