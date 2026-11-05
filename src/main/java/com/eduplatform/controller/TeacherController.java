package com.eduplatform.controller;
import com.eduplatform.model.Teacher; import com.eduplatform.service.TeacherService;
import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/teachers") @CrossOrigin(origins="*")
public class TeacherController {
 private final TeacherService service;
 public TeacherController(TeacherService service){this.service=service;}
 @GetMapping public List<Teacher> all(){return service.findAll();}
 @GetMapping("/{id}") public Teacher one(@PathVariable Long id){return service.findById(id);}
 @PostMapping public Teacher create(@Valid @RequestBody Teacher x){return service.create(x);}
 @PutMapping("/{id}") public Teacher update(@PathVariable Long id,@Valid @RequestBody Teacher x){return service.update(id,x);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}