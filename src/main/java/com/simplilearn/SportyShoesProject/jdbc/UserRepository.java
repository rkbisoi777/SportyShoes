package com.simplilearn.SportyShoesProject.jdbc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.SportyShoesProject.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

	public List<User> findByusername(String username);
}
