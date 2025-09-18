package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	MyRepo repo;
	
	@PostMapping("/user")
	public User add(@RequestBody User u)
	{
		return this.repo.save(u);
	}
	@GetMapping("/")
	public List<User> show()
	{
		return this.repo.findAll();
	}

}
