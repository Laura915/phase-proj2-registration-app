package com.hcl.loginproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MainController {
	 @Autowired
	    UserRepository userRepository;

	  @GetMapping(path = "/home")
	    String home() {
		  	
		  //Saves user		  	
		    User user1 = new User();
	        user1.setName("Velma");
	        user1.setUsername("ve");
	        user1.setPassword ("123");
	        userRepository.save(user1);
	       
	        //get all users
	        Iterable<User> users = userRepository.findAll();

	        String myUsers = "<h2>Users</h2>";
	        for (User u: users) {
	            myUsers = myUsers + "<p>" + u.getName()+ "</p>";
	        }
	        return myUsers;
	    }
	  
}


