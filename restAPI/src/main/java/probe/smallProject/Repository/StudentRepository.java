package probe.smallProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import probe.smallProject.Model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
//    @Query(value="Select Student where name= 'EZZ'")
//    Student someQuery();
}
