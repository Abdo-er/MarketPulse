package com.eduplatform.service;
import com.eduplatform.model.Enrollment; import com.eduplatform.repository.EnrollmentRepository;
import org.springframework.stereotype.Service; import java.util.List;
@Service public class EnrollmentService {
 private final EnrollmentRepository repo;
 public EnrollmentService(EnrollmentRepository repo){this.repo=repo;}
 public List<Enrollment> findAll(){return repo.findAll();}
 public Enrollment findById(Long id){return repo.findById(id).orElseThrow(()->new RuntimeException("Enrollment not found: "+id));}
 public Enrollment create(Enrollment x){x.setId(null);return repo.save(x);}
 public Enrollment update(Long id,Enrollment x){Enrollment old=findById(id);x.setId(old.getId());return repo.save(x);}
 public void delete(Long id){repo.delete(findById(id));}
 public long count(){return repo.count();}
}