package probe.smallProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import probe.smallProject.Model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Long> {
	@Query(value = "SELECT COUNT(*) FROM LOGIN WHERE EMAIL= ?1 ", nativeQuery = true)
	public int existsByEmail(String email);
	
	@Query(value = "SELECT * FROM LOGIN WHERE EMAIL= ?1 ", nativeQuery = true)
	public Optional<Login> findByEmail(String email);
	
	@Query(value = "SELECT rolle FROM LOGIN WHERE EMAIL= ?1 AND PASSWORD =?2 ", nativeQuery = true)
	public String getRolle(String email, String password);
}
