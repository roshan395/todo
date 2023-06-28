package com.roshan.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("ronak");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		return isValidUserName && isValidPassword;
	}

}
