package com.shc.automation.services.impl;

public class LoginServiceImpl {
	
	public boolean login(String userName,String password)
	{
		if (userName.equalsIgnoreCase("smadhok") && password.equalsIgnoreCase("hello"))
			return true;
		else
			return false;
		
	}

}
