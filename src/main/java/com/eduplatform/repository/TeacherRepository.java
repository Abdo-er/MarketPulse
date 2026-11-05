package com.eduplatform.repository;
import com.eduplatform.model.Teacher; import org.springframework.data.jpa.repository.JpaRepository;
public interface TeacherRepository extends JpaRepository<Teacher,Long>{}