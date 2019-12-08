
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
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

		// System.out.println("Loaded successfully init method");

	}

	
	/*
	 * @Test 
	 * public void testAddCategory() {
	 * 
	 *  category = new Category();
	 * 	category.setId(0);
	 *  category.setName("Non Technical");
	 * 
	 * category.setDescription("This My Second Category");
	 * category.setImageUrl("Cat_2.png"); 
	 * category.setActive(false);
	 * 
	 * //System.out.println("++++++++++++++++++++++++" + category.getName());
	 * 
	 * assertEquals("Successfully added a category inside the table ", true,
	 * categoryDAO.add(category)); }
	 * 
	 * 
	 * 
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * assertEquals("Successfully fetched  a single category from the table ",
	 * "Languges", category.getName());
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Test public void testupdateCategory() {
	 * 
	 * category = categoryDAO.get(2); category.setName("Books");
	 * assertEquals("Successfully updated  a single category in the table ",true,
	 * categoryDAO.update(category));
	 * 
	 * }
	 * 
	 * 
	 * @Test public void testdeleteCategory() {
	 * 
	 * category = categoryDAO.get(2); category.setName("Books");
	 * assertEquals("Successfully deleted  a single category in the table ",true,
	 * categoryDAO.delete(category));
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Test public void testListCategory() {
	 * 
	 * category = categoryDAO.get(2); category.setName("Books");
	 * assertEquals("Successfully fateched  categories from the table ",2,
	 * categoryDAO.list().size());
	 * 
	 * }
	 * 
	 */
	@Test
	public void testCRUDCategory() {

		// add operation
		category = new Category();
		category.setId(0);
		category.setName("Programming");
		category.setDescription("This My First Category");
		category.setImageUrl("Cat_21.png");
		category.setActive(true);

		assertEquals("Successfully added a category inside the table ", true, categoryDAO.add(category));

		category = new Category();
		category.setId(0);
		category.setName("Technical");
		category.setDescription("This My Second Category");
		category.setImageUrl("Cat_22.png");
		category.setActive(true);

		assertEquals("Successfully added a category inside the table ", true, categoryDAO.add(category));

		category = new Category();
		category.setId(0);
		category.setName("Non Technical");
		category.setDescription("This My Third Category");
		category.setImageUrl("Cat_23.png");
		category.setActive(true);

		assertEquals("Successfully added a category inside the table ", true, categoryDAO.add(category));

		category = new Category();
		category.setId(0);
		category.setName("Uncategorzied");
		category.setDescription("This My Uncategorzied Category");
		category.setImageUrl("Cat_24.png");
		category.setActive(true);

		assertEquals("Successfully added a category inside the table ", true, categoryDAO.add(category));

		// update operation
		// fetching and updating the category

		category = categoryDAO.get(2);
		category.setName("Languges");
		assertEquals("Successfully updated  a single category in the table ", true, categoryDAO.update(category));

		// delete the category

		assertEquals("Successfully deleted  a single category in the table ", true, categoryDAO.delete(category));

		// fetching the list

		assertEquals("Successfully fateched  categories from the table ", 3, categoryDAO.list().size());
	}

}
