package org.spring.onlineblogingbackend.dao;

import java.util.List;

import org.spring.onlineblogingbackend.dto.Article;

public interface ArticleDAO {

	//CRUD Method
	
	Article get(int articleid);
	List<Article> list();
	boolean add(Article article);
	boolean update(Article article);
	boolean delete(Article article);

	
	//Bushiness Method
	List<Article> listActiveArticles();
	List<Article> listActiveArticleByCategory(int categoryId);
	List<Article> getLatestActiveArticles(int count);
}
