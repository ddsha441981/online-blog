
package org.spring.onlineblogingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.sping.onlineblogingbackend.dto.Category;
import org.spring.onlineblogingbackend.dao.CategoryDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("org.spring.onlineblogingbackend");
		System.out.println( );
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

		//System.out.println("Loaded successfully init method");

	}

	@Test
	public void testAddCategory() {

		System.out.println("Inside in test method");
		category = new Category();

		category.setName("Languges");
		
		category.setDescription("This My First Category");
		category.setImageUrl("Cat_1.png");
		//System.out.println("++++++++++++++++++++++++" + category.getName());
		
		assertEquals("Successfully added a category inside the table ", true, categoryDAO.add(category));
		//System.out.println("++++++++++++++++++++++++" +categoryDAO.add(category));
		

	}
}
