package org.spring.onlineblogingbackend.dao;

import java.util.List;

import org.spring.onlineblogingbackend.dto.Category;

public interface CategoryDAO {


	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}
