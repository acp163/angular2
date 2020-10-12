package net.javaguides.springboot.helloworldapp.controller;

import net.javaguides.springboot.helloworldapp.bean.Order;
import net.javaguides.springboot.helloworldapp.bean.User;
import net.javaguides.springboot.helloworldapp.repo.OrderRepo;
import net.javaguides.springboot.helloworldapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.helloworldapp.bean.AuthenticationBean;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {


	@Autowired
	UserRepo  userRepo;

	@Autowired
	OrderRepo orderRepo;

	@GetMapping(path= "/test")
	public String getStarted(){
        return "hello this test api";
	}

	@GetMapping(path = "/user")
	public List<User> getUserDetails(){
		return  userRepo.findAll();

	}

	@GetMapping(path = "/user/{username}")
	public User getUserDetailsViaUsername(@PathVariable String username){
		return  userRepo.findByUsername(username);
	}

	@PostMapping(path = "/user")
	public User saveUserDetails(@RequestBody User user){
		return  userRepo.save(user);
	}

	@PostMapping(path = "/order")
	public Order saveOrderDetails(@RequestBody Order order){
		return  orderRepo.save(order);
	}


	@GetMapping(path = "/basicauth")
	public void getUsferDetails(){

	}
//	public AuthenticationBean helloWorldBean() {
//		return new AuthenticationBean("You are authenticated");
//	}
}
