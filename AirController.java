package com.demojbk.ARS.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirController {
	@Autowired
	SessionFactory sf;
	
	
@GetMapping("single record \n{id}")
public String name(@PathVariable int id) {
	Session s=sf.openSession();
	Air a=s.get(Air.class,101);
	
	return "Get single record \n" +a;
}
}
