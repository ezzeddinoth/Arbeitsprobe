package probe.smallProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import probe.smallProject.Model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
