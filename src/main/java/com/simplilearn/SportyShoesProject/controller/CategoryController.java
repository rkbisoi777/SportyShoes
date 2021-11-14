package com.simplilearn.SportyShoesProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simplilearn.SportyShoesProject.entity.Category;
import com.simplilearn.SportyShoesProject.service.CategoryService;



@Controller
public class CategoryController {
	@Autowired
	private CategoryService catserv;
	
	@RequestMapping("/listcat")
	public String viewListPage(Model model)
	{
		List<Category> listCategories= catserv.listAll();
		model.addAttribute("listCategories", listCategories);
		return "manage";
		
	}
	
	@RequestMapping("/new")
	public String addNewCatPage(Model model)
	{
		Category categories= new Category();
		model.addAttribute("categories", categories);
		
		return "new_category";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("categories") Category categories, Model m) 
	{   
		
		catserv.save(categories);
		List<Category> listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
		
		return "manage";
	
	}	
	
	@RequestMapping("/delete/{id}")
	public String deleteCategory(@PathVariable(name ="id") long id, Model m)
	{
		catserv.delete(id);
		List<Category> listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
		
		return "manage";
	}
		
	

}