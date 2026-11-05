package com.eduplatform.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Teacher {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String fullName;
 @Email @NotBlank @Column(unique=true) private String email;
 private String specialization, phone, status="ACTIVE";
 public Teacher(){}
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public String getFullName(){return fullName;} public void setFullName(String v){fullName=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getSpecialization(){return specialization;} public void setSpecialization(String v){specialization=v;}
 public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}