package com.eduplatform.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Course {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String title;
 @Column(length=1500) private String description;
 private String category, level, status="PUBLISHED", teacherName;
 @PositiveOrZero private double price;
 private Long teacherId;
 public Course(){}
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public String getTitle(){return title;} public void setTitle(String v){title=v;}
 public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public String getCategory(){return category;} public void setCategory(String v){category=v;}
 public String getLevel(){return level;} public void setLevel(String v){level=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public double getPrice(){return price;} public void setPrice(double v){price=v;}
 public Long getTeacherId(){return teacherId;} public void setTeacherId(Long v){teacherId=v;}
 public String getTeacherName(){return teacherName;} public void setTeacherName(String v){teacherName=v;}
}