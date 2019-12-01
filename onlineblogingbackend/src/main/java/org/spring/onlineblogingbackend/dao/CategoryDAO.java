package org.spring.onlineblogingbackend.dao;

import java.util.List;

import org.spring.onlineblogingbackend.dto.Category;

public interface CategoryDAO {


	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
	
}
