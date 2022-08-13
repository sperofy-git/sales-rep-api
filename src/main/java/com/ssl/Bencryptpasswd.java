package com.ssl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Bencryptpasswd {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encoded = encoder.encode("dummypassword6");
		
		System.out.print(encoded);
		
		
	}

}
