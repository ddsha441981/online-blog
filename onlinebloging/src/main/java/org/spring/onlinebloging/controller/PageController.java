package org.spring.onlinebloging.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to the Spring mvc");
		return mv;
	}
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
	
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		System.out.println("hello");
		if(greeting == null) {
			greeting ="Provide String first on Url with help of ?";
		}
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
}
