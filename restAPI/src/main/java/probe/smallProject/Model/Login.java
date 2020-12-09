package probe.smallProject.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	// @GeneratedValue
	private String email;

	private String password;

	public String rolle;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRolle() {
		return rolle;
	}

	public void setRolle(String rolle) {
		this.rolle = rolle;
	}


	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}

}
