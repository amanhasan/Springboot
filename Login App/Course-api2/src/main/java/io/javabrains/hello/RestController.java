package io.javabrains.hello;

import io.javabrains.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import io.javabrains.modal.User;




@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String sayHi() {
		return "HI";
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String password) {
		User user = new User(username,firstname,lastname,age,password);
		userService.saveMyUser(user);
		return "user saved";
	}
}
