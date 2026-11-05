package com.eduplatform.controller;
import com.eduplatform.service.*; import org.springframework.web.bind.annotation.*; import java.util.Map;
@RestController @RequestMapping("/api/dashboard") @CrossOrigin(origins="*")
public class DashboardController {
 private final StudentService s; private final TeacherService t; private final CourseService c; private final EnrollmentService e;
 public DashboardController(StudentService s,TeacherService t,CourseService c,EnrollmentService e){this.s=s;this.t=t;this.c=c;this.e=e;}
 @GetMapping("/stats") public Map<String,Long> stats(){return Map.of("students",s.count(),"teachers",t.count(),"courses",c.count(),"enrollments",e.count());}
}