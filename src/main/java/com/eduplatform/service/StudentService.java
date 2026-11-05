package com.eduplatform.service;
import com.eduplatform.model.Student; import com.eduplatform.repository.StudentRepository;
import org.springframework.stereotype.Service; import java.util.List;
@Service public class StudentService {
 private final StudentRepository repo;
 public StudentService(StudentRepository repo){this.repo=repo;}
 public List<Student> findAll(){return repo.findAll();}
 public Student findById(Long id){return repo.findById(id).orElseThrow(()->new RuntimeException("Student not found: "+id));}
 public Student create(Student x){x.setId(null);return repo.save(x);}
 public Student update(Long id,Student x){Student old=findById(id);x.setId(old.getId());return repo.save(x);}
 public void delete(Long id){repo.delete(findById(id));}
 public long count(){return repo.count();}
}