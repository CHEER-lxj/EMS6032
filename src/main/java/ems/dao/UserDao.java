package ems.dao;

import ems.entity.User;

public interface UserDao {
	public User selectUser(String username);
	
}
