package probe.smallProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import probe.smallProject.Model.Login;
import probe.smallProject.Repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;


	public boolean emailExists(String email) {
		return loginRepository.existsByEmail(email) == 1;
	}

	public String getRolle(String email, String password) {
		return loginRepository.getRolle(email, password);
	}

	public boolean updateLogin(Login login) {
		// TODO adjust return //Exception
		if (loginRepository.existsByEmail(login.getEmail()) == 1) {
			loginRepository.save(login);
			return true;
		}
		return false;
	}

	public boolean saveLogin(Login login) {
		// TODO adjust return //Exception
		if (loginRepository.existsByEmail(login.getEmail()) == 0) {
			loginRepository.save(login);
			return true;
		}
		return false;
	}

}