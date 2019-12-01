
package org.spring.onlineblogingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.onlineblogingbackend.dao.CategoryDAO;
import org.spring.onlineblogingbackend.dto.Category;
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
		category.setId(0);
		category.setName("Non Technical");
		
		category.setDescription("This My Second Category");
		category.setImageUrl("Cat_2.png");
		category.setActive(false);
		
		//System.out.println("++++++++++++++++++++++++" + category.getName());
		
		assertEquals("Successfully added a category inside the table ", true, categoryDAO.add(category));
		//System.out.println("++++++++++++++++++++++++" +categoryDAO.add(category));
		

	}
}
