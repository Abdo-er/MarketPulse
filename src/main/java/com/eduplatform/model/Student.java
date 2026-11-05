package com.eduplatform.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Student {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String fullName;
 @Email @NotBlank @Column(unique=true) private String email;
 private String phone, level, status="ACTIVE";
 public Student(){}
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public String getFullName(){return fullName;} public void setFullName(String v){fullName=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
 public String getLevel(){return level;} public void setLevel(String v){level=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}