package com.eduplatform.repository;
import com.eduplatform.model.Enrollment; import org.springframework.data.jpa.repository.JpaRepository;
public interface EnrollmentRepository extends JpaRepository<Enrollment,Long>{}