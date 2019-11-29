package org.spring.onlinebloging.controller;

import org.spring.onlineblogingbackend.dao.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	/**Dependency Injection*/
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		/* mv.addObject("greeting", "Welcome to the Spring mvc"); */
		mv.addObject("tittle", "Home");
		
		//Passing the category list
		mv.addObject("categories", categoryDAO.list());
		
		System.out.println(categoryDAO.list().toString());
		
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

	/** for testing purpose only */
	/*
	 * @RequestMapping(value = "/test") public ModelAndView test(@RequestParam(value
	 * = "greeting" , required=false) String greeting) {
	 * 
	 * if(greeting == null) { greeting
	 * ="Provide String first on Url with help of ?"; }
	 * 
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("greeting",
	 * greeting); return mv; }
	 */

	/*
	 * @RequestMapping(value = "/test/{greeting}") public ModelAndView
	 * test(@PathVariable("greeting") String greeting) {
	 * System.out.println("hello"); if(greeting == null) { greeting
	 * ="Provide String first on Url with help of ?"; }
	 * 
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("greeting",
	 * greeting); return mv; }
	 */

}
