package com.bluebarracuda.controller;
import com.bluebarracuda.model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import com.bluebarracuda.repo.UserRepo;

@CrossOrigin(origins="http://localhost:4200")
@Controller
@RequestMapping(value="/user")
public class UserController {
	

	private UserRepo userRepo;
	
	public UserController() {
	}

	@Autowired
	public UserController(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	@GetMapping(value="/getAllUsers.app")
	public @ResponseBody List<User> getAllUsers(){
		System.out.println("In get All user");
		return userRepo.selectAll();
	}
	
	@PostMapping(value="/getUserById.app")
	public @ResponseBody User getUserById(@RequestParam("id") int num) {
		return userRepo.selectById(num);
	}
	
	@PostMapping(value="{num}/getUserByUri.app")
	public @ResponseBody User getUserByUri(@PathVariable("num") int num) {
		return userRepo.selectById(num);
	}
}