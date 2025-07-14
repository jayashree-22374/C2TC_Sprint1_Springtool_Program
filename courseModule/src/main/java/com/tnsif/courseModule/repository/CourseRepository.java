package com.tnsif.courseModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.courseModule.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
