package com.LSS.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LSS.models.Login;
import com.LSS.repository.LoginRepository;

@Service
public class LoginService {
	private final LoginRepository Loginrepository;
	@Autowired
	public LoginService(LoginRepository LoginRepository) {
		this.Loginrepository=LoginRepository;
	}
	public boolean Verification (String username,String pass) {
		List<Login> pass1 = Loginrepository.findPassByUsernameAndPass(username, pass);
		if(pass1== null) {
			return false;
		}
		if(pass1.get(0).getPassword().equals(pass)) {
			return true;
		
		}else {
			return false;
		}
		
	}
	

	

}
