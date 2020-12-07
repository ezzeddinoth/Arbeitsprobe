package probe.smallProject.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import probe.smallProject.Model.Login;
import probe.smallProject.Model.Order;
import probe.smallProject.Repository.LoginRepository;
import probe.smallProject.Repository.OrderRepository;



@Service
public class LoginService {
	
	@Autowired
	private LoginRepository  loginRepository;
	
  

    public Set<Login> findAll() {
    	Iterable<Login> iterable = loginRepository.findAll();
    	Set<Login> personSet = new HashSet<Login>();
        iterable.forEach(e-> personSet.add(e));
    	return personSet;
    }
    
    public Optional<Login> findByEmail(String email) {
    	return loginRepository.findByEmail(email);
    }
    
//    public boolean  deleteById(Long id) {
//    	//TODO check 
//    	loginRepository.deleteById(id);	  
//    	return true; //check
//    }
    
    public boolean emailExists(String email) {
    	
    	return loginRepository.existsByEmail(email)==1;
    }
    
    public String getRolle(String email, String password) {
    	return loginRepository.getRolle(email, password);
    }
    
    public boolean updateLogin(Login login) {
    	//TODO adjust return //Exception
    	if(loginRepository.existsByEmail(login.getEmail())==1) {
    		loginRepository.save(login); 
    		return true;
    	}
    	return false;
    }
    
    public boolean saveLogin(Login login) {
    	//TODO adjust return //Exception
    	if(loginRepository.existsByEmail(login.getEmail())==0) {
    		loginRepository.save(login); 
    		return true;
    	}
    	return false;
    }
    


}