package probe.smallProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import probe.smallProject.Model.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

}
