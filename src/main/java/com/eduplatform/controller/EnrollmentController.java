package com.eduplatform.controller;
import com.eduplatform.model.Enrollment; import com.eduplatform.service.EnrollmentService;
import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/enrollments") @CrossOrigin(origins="*")
public class EnrollmentController {
 private final EnrollmentService service;
 public EnrollmentController(EnrollmentService service){this.service=service;}
 @GetMapping public List<Enrollment> all(){return service.findAll();}
 @GetMapping("/{id}") public Enrollment one(@PathVariable Long id){return service.findById(id);}
 @PostMapping public Enrollment create(@Valid @RequestBody Enrollment x){return service.create(x);}
 @PutMapping("/{id}") public Enrollment update(@PathVariable Long id,@Valid @RequestBody Enrollment x){return service.update(id,x);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}