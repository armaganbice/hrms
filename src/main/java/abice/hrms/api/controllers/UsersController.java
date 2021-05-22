package abice.hrms.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abice.hrms.business.absracts.UserService;
import abice.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	UserService userService;
	
	@Autowired
	public UsersController(UserService userService)
	{ 
		super();
		this.userService=userService;
	}
	
	@GetMapping("/getall")
	public List<User> getAll()
	{
		return userService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<User> getById(@PathVariable("id") final int id)
	{
		return userService.getById(id);
	}

}
