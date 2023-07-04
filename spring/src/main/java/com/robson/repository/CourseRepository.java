package com.robson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robson.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
