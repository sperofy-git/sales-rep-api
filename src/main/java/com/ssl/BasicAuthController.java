package com.ssl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssl.salesrepapi.beans.MyBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthController {
	
	
	@GetMapping( path = "/basicauth")
	public BasicAuthBean getBean() {
		
		return new BasicAuthBean("You are authenticated");
	}
	

}
