package com.simplilearn.SportyShoesProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.SportyShoesProject.entity.User;
import com.simplilearn.SportyShoesProject.jdbc.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	
	//public List<UserDetails> listAll(){
		//List<UserDetails> ud=new ArrayList<UserDetails>();
		//ud= userRepo.findAll();
		//System.out.println("userdetails "+ud);
		//return ud;
	//}
	
	
	public List<User> listAll()
	{
		return userRepo.findAll();
	}
	
	public List<User> get(String username) {
		return userRepo.findByusername(username);
	}

}


