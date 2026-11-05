package com.eduplatform.repository;
import com.eduplatform.model.Course; import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepository extends JpaRepository<Course,Long>{}