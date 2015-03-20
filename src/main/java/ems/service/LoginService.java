package ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ems.dao.UserDao;
import ems.entity.User;

@Service
public class LoginService {
	@Autowired
	private UserDao userDao;
	
	public String login(String username, String password){
		String output = null;
		User user = userDao.selectUser(username);
		output = user.getUsername() + " " + user.getPassword();
		
		return output;
	}
}
