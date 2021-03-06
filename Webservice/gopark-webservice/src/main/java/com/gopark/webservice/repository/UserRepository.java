package com.gopark.webservice.repository;

import com.gopark.webservice.entity.User;

public interface UserRepository {
	
	
	public User findOne(String id);
	
	public User create(User user);
	
	public User update(User user);
	
	public void delete(User user);
}
