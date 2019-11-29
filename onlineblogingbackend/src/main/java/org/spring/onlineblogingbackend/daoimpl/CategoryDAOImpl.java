package org.spring.onlineblogingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.sping.onlineblogingbackend.dto.Category;
import org.spring.onlineblogingbackend.dao.CategoryDAO;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	/*dummy data for testing purpose**/
	
	private static List<Category> categories =  new ArrayList<>();
	
	/** static block*/
	
	static {
		
		
		Category category = new Category();
		
		/*** Adding first Category*/
		
		category.setId(1);
		category.setName("Languges");
		category.setDescripation("This My First Category");
		category.setImageUrl("Cat_1.png");
		
		
		categories.add(category);

		/*** Adding Second Category */

		category = new Category();
		
		category.setId(2);
		category.setName("Technology");
		category.setDescripation("This My Second Category");
		category.setImageUrl("Cat_1.png");
		
		
		categories.add(category);

		/*** Adding Third Category */

		category = new Category();
		
		category.setId(3);
		category.setName("Java");
		category.setDescripation("This My Third Category");
		category.setImageUrl("Cat_1.png");
		
		
		categories.add(category);

		/*** Adding first Four */

		category = new Category();
		
		category.setId(4);
		category.setName("Spring");
		category.setDescripation("This My Four Category");
		category.setImageUrl("Cat_1.png");
		
		
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
