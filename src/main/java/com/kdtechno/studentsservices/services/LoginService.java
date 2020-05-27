package com.kdtechno.studentsservices.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String name, String password) {
		// TODO Auto-generated method stub
		return name.equalsIgnoreCase("matthias") && 
				password.equalsIgnoreCase("matthias");
	}

}
