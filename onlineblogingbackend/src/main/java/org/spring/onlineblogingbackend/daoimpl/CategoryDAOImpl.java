package org.spring.onlineblogingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.spring.onlineblogingbackend.dao.CategoryDAO;
import org.spring.onlineblogingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/* dummy data for testing purpose **/

	private static List<Category> categories = new ArrayList<>();

	/** static block */

	static {

		Category category = new Category();

		/*** Adding first Category */

		category.setId(1);
		category.setName("Languges");
		category.setDescription("This My First Category");
		category.setImageUrl("Cat_1.png");

		categories.add(category);

		/*** Adding Second Category */

		category = new Category();

		category.setId(2);
		category.setName("Technology");
		category.setDescription("This My Second Category");
		category.setImageUrl("Cat_1.png");

		categories.add(category);

		/*** Adding Third Category */

		category = new Category();

		category.setId(3);
		category.setName("Java");
		category.setDescription("This My Third Category");
		category.setImageUrl("Cat_1.png");

		categories.add(category);

		/*** Adding first Four */

		category = new Category();

		category.setId(4);
		category.setName("Spring");
		category.setDescription("This My Four Category");
		category.setImageUrl("Cat_1.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for (Category category : categories) {

			if (category.getId() == id) {
				return category;
			}
		}

		return null;
	}

	@Override
	@Transactional
	public boolean add(Category category) {

		try {
			// add the category to the database table
			
			System.out.println(category.toString()+" In daoimpl");
			
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} 
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Return false");
			return false;
		}

	}

}
