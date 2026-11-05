package com.eduplatform.service;
import com.eduplatform.model.Teacher; import com.eduplatform.repository.TeacherRepository;
import org.springframework.stereotype.Service; import java.util.List;
@Service public class TeacherService {
 private final TeacherRepository repo;
 public TeacherService(TeacherRepository repo){this.repo=repo;}
 public List<Teacher> findAll(){return repo.findAll();}
 public Teacher findById(Long id){return repo.findById(id).orElseThrow(()->new RuntimeException("Teacher not found: "+id));}
 public Teacher create(Teacher x){x.setId(null);return repo.save(x);}
 public Teacher update(Long id,Teacher x){Teacher old=findById(id);x.setId(old.getId());return repo.save(x);}
 public void delete(Long id){repo.delete(findById(id));}
 public long count(){return repo.count();}
}