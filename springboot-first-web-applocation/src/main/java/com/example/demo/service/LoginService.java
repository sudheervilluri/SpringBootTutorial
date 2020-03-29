package com.example.demo.service;

import org.springframework.stereotype.Component;


@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin");
	}
}
