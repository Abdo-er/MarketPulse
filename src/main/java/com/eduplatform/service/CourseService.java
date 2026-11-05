package com.eduplatform.service;
import com.eduplatform.model.Course; import com.eduplatform.repository.CourseRepository;
import org.springframework.stereotype.Service; import java.util.List;
@Service public class CourseService {
 private final CourseRepository repo;
 public CourseService(CourseRepository repo){this.repo=repo;}
 public List<Course> findAll(){return repo.findAll();}
 public Course findById(Long id){return repo.findById(id).orElseThrow(()->new RuntimeException("Course not found: "+id));}
 public Course create(Course x){x.setId(null);return repo.save(x);}
 public Course update(Long id,Course x){Course old=findById(id);x.setId(old.getId());return repo.save(x);}
 public void delete(Long id){repo.delete(findById(id));}
 public long count(){return repo.count();}
}