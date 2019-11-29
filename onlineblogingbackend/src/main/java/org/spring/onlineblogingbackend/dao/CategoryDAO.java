package org.spring.onlineblogingbackend.dao;

import java.util.List;

import org.sping.onlineblogingbackend.dto.Category;

public interface CategoryDAO {


	List<Category> list();
	Category get(int id);
	
}
