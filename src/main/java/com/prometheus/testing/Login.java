package com.prometheus.testing;

public class Login {
	
	public boolean login(String username, String password) {
		return username.equals("validUsername") && password.equals("validPassword");
	}
	
}
