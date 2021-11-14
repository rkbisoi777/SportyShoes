package com.simplilearn.SportyShoesProject.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.SportyShoesProject.entity.Category;
import com.simplilearn.SportyShoesProject.jdbc.CategoryRepository;

@Service
@Transactional
public class CategoryService {
	@Autowired
	private CategoryRepository catrepo;
	
	public List<Category> listAll()
	{
		return catrepo.findAll();
	}
	
	public void save(Category category)
	{
		 catrepo.save(category);
	}
	
	public Category get(long id)
	{
		return catrepo.findById(id).get();
	}
	
	public void delete(long id)
	{
		catrepo.deleteById(id);
	}

}
