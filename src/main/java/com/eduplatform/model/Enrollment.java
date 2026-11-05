package com.eduplatform.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity @Table(uniqueConstraints=@UniqueConstraint(columnNames={"studentId","courseId"}))
public class Enrollment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long studentId, courseId;
 private String studentName, courseTitle, status="ACTIVE";
 private LocalDate enrolledAt=LocalDate.now();
 public Enrollment(){}
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public Long getStudentId(){return studentId;} public void setStudentId(Long v){studentId=v;}
 public Long getCourseId(){return courseId;} public void setCourseId(Long v){courseId=v;}
 public String getStudentName(){return studentName;} public void setStudentName(String v){studentName=v;}
 public String getCourseTitle(){return courseTitle;} public void setCourseTitle(String v){courseTitle=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public LocalDate getEnrolledAt(){return enrolledAt;} public void setEnrolledAt(LocalDate v){enrolledAt=v;}
}