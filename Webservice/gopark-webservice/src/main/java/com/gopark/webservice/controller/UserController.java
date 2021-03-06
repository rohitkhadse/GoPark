package com.gopark.webservice.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gopark.webservice.entity.User;
import com.gopark.webservice.service.UserService;


@Component
@ResponseBody

@RestController
@RequestMapping(value = "users")
public class UserController {

	private UserService service;
	
	public UserController(UserService service){
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public User findOne(@PathVariable("id") String id){
		return service.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST )
	public User create(@RequestBody User user){
		return service.create(user);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public User update(@PathVariable("id")String id,@RequestBody User user){
		return service.update(id, user);
	}
	

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(String id){
		service.delete(id);
	}
}
