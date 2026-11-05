package com.eduplatform.controller;
import com.eduplatform.model.Course; import com.eduplatform.service.CourseService;
import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/courses") @CrossOrigin(origins="*")
public class CourseController {
 private final CourseService service;
 public CourseController(CourseService service){this.service=service;}
 @GetMapping public List<Course> all(){return service.findAll();}
 @GetMapping("/{id}") public Course one(@PathVariable Long id){return service.findById(id);}
 @PostMapping public Course create(@Valid @RequestBody Course x){return service.create(x);}
 @PutMapping("/{id}") public Course update(@PathVariable Long id,@Valid @RequestBody Course x){return service.update(id,x);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}