package com.example.springssogoogle;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
	public String welcome() {
		return "Welcome to Oauth2";
	}
    
    @GetMapping("/user")
	public Principal user(Principal principal) {
    	System.out.println("Username: "+principal.getName());
		return principal;
	}
}
