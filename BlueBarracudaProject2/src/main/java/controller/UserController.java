package controller;

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

import model.User;
import repository.UserRepo;

@CrossOrigin(origins="http://localhost:4200")
@Controller
@RequestMapping(value="/Project2")
public class UserController {
	

	private UserRepo userRepo;
	
	public UserController() {
	}

	@Autowired
	public UserController(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	@GetMapping(value="/getAllUser.app")
	public @ResponseBody List<User> getAllUser(){
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
	
<<<<<<< HEAD
	
	@PostMapping(value="/login.app")
	public @ResponseBody User login(@RequestParam("username") String username,@RequestParam("password") String password){
		
		User user =userRepo.selectByUsername(username);
		if(user == null) {
			return null;
		}
		
		return user;
	}
	
=======
	@PostMapping(value="/registerUser.app")
	public @ResponseBody void addNewUser(User user) {
		userRepo.insert(user);
	}
	
	@PostMapping(value="/updatePassword.app")
	public @ResponseBody void updatePassword(User user) {
		userRepo.update(user);
	}
	
	@PostMapping(value="/removeUser.app")
	public @ResponseBody void removeUser(User user) {
		userRepo.delete(user);
	}
>>>>>>> bd78206625217927135dc3c72d00c13d3e324e6a
}
