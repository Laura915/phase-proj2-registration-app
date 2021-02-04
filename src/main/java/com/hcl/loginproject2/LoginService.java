package com.hcl.loginproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoginService {
	 @Autowired
	    UserRepository userRepository;
	 
	 public void saveUser(String name, String username, String password) {
			User newUser = new User();
			newUser.setName(name);
			newUser.setUsername(username);
			newUser.setPassword(password);

			userRepository.save(newUser);
		
		}
	 
	 public boolean searchUser(String username) {
			Iterable<User> users = userRepository.findAll();
			
			for (User user : users) {
				if(user.getUsername().toLowerCase().equals(username.toLowerCase())) {
					
					return true;
				}
			}
			return false;
	 }
	 
	
}
