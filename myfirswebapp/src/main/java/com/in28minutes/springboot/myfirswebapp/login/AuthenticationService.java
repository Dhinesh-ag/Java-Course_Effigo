package com.in28minutes.springboot.myfirswebapp.login;

import org.springframework.stereotype.Service;

@Service
	public class AuthenticationService
	{
		public boolean authenticate(String username,String password)
		{
			boolean isValidUsername=username.equalsIgnoreCase("dhinesh");
			boolean isValidpassword=password.equalsIgnoreCase("dummy");
			return isValidUsername && isValidpassword ;
			
		}
			
	}


