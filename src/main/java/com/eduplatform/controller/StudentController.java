package com.eduplatform.controller;
import com.eduplatform.model.Student; import com.eduplatform.service.StudentService;
import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/students") @CrossOrigin(origins="*")
public class StudentController {
 private final StudentService service;
 public StudentController(StudentService service){this.service=service;}
 @GetMapping public List<Student> all(){return service.findAll();}
 @GetMapping("/{id}") public Student one(@PathVariable Long id){return service.findById(id);}
 @PostMapping public Student create(@Valid @RequestBody Student x){return service.create(x);}
 @PutMapping("/{id}") public Student update(@PathVariable Long id,@Valid @RequestBody Student x){return service.update(id,x);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}