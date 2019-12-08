package org.spring.onlinebloging.controller;

import org.spring.onlineblogingbackend.dao.CategoryDAO;
import org.spring.onlineblogingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	/** Dependency Injection */
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		/* mv.addObject("greeting", "Welcome to the Spring mvc"); */
		mv.addObject("tittle", "Home");

		// Passing the category list
		mv.addObject("categories", categoryDAO.list());

		// System.out.println(categoryDAO.list().toString());

		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		/* mv.addObject("greeting", "Welcome to the Spring mvc"); */
		mv.addObject("tittle", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		/* mv.addObject("greeting", "Welcome to the Spring mvc"); */
		mv.addObject("tittle", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/** Methods to load all posts and based on category */

	@RequestMapping(value = "/show/all/posts")
	public ModelAndView showAllPosts() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("tittle", "All Posts");

		// Passing the category list
		mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickAllPosts", true);
		return mv;
	}

	// category fetch based on id
	@RequestMapping(value = "/show/category/{id}/posts")
	public ModelAndView showCategoryPosts(@PathVariable("id") int id) {

		ModelAndView mv = new ModelAndView("page");

		// categoryDAo fetch single category
		Category category = null;
		category = categoryDAO.get(id);

		mv.addObject("tittle", category.getName());

		// Passing the category list
		mv.addObject("categories", categoryDAO.list());

		// passing the category object
		mv.addObject("category", category);

		// System.out.println(categoryDAO.list().toString());

		mv.addObject("userClickCategoryPosts", true);
		return mv;
	}

	/** for testing purpose only */

	/*
	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) {

		if (greeting == null) {
			greeting = "Provide String first on Url with help of ?";
		}

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	 */
	
	 /* 
	@RequestMapping(value = "/test/{greeting}") 
	  public ModelAndView test(@PathVariable("greeting") String greeting) {
	  
	  if(greeting == null) {
		  greeting = "Provide String first on Url with help of ?"; 
		  }
	  
	  ModelAndView mv = new ModelAndView("page"); 
	  mv.addObject("greeting",greeting); 
	  return mv; 
	  }
	  */
	 

}
