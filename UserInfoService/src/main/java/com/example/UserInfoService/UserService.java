package com.example.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public Iterable<User> getListOfUsers(){
		return userRepository.findAll();
	}
	
	
	public User getUser(int id) {
		
		return userRepository.findById(id).orElse(null);
	}

	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	} 
	

}
