package com.ssl.salesrepapi.services;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssl.salesrepapi.beans.MyBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorld {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String getHello() {
		
		return "Hello Sita Rama";
	}
	
	@GetMapping( path = "/hello2")
	public String getHello2() {
		
		return "From Hello2";
	}
	
	@GetMapping( path = "/my-bean")
	public MyBean getBean() {
		
		return new MyBean("From the Bean");
	}
	
	@GetMapping( path="/my-bean/path-variable/{name}")
	public MyBean getBeanParam (@PathVariable String name)
	{
		return new MyBean(String.format("From the Bean Param %s", name));
	}

}
