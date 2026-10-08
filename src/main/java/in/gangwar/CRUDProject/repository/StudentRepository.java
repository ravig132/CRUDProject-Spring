package in.gangwar.CRUDProject.repository;

import in.gangwar.CRUDProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    Optional<Student> findByIdAndDeletedIsFalse(Long id);


    List<Student> findByDeletedIsFalse();
}
