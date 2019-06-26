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
<<<<<<< HEAD



=======
import com.bluebarracuda.model.User;
>>>>>>> b1877fcd3ed9868f99b87ecf972f74d9f53f4920
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
	
	@GetMapping(value="/getAllUsers")
	public @ResponseBody List<User> getAllUsers(){
		System.out.println("In get All user");
		return userRepo.selectAll();
	}
	
	@PostMapping(value="/getUserById")
	public @ResponseBody User getUserById(@RequestParam("id") int num) {
		return userRepo.selectById(num);
	}
	
	@PostMapping(value="{num}/getUserByUri")
	public @ResponseBody User getUserByUri(@PathVariable("num") int num) {
		return userRepo.selectById(num);
	}
	
}