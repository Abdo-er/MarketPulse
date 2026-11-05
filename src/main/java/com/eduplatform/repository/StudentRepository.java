package com.eduplatform.repository;
import com.eduplatform.model.Student; import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student,Long>{}