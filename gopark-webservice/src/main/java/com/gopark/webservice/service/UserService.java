package com.gopark.webservice.service;

import com.gopark.webservice.entity.User;

public interface UserService {
	
	public User findOne(String id);
	
	public User create(User user);
	
	public User update(String id, User user);
	
	public void delete(String id);
}
