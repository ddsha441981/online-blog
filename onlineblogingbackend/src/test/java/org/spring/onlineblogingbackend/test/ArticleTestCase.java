package org.spring.onlineblogingbackend.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.onlineblogingbackend.dao.ArticleDAO;
import org.spring.onlineblogingbackend.dto.Article;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArticleTestCase {

	public static AnnotationConfigApplicationContext context;
	private static ArticleDAO articleDAO;
	private Article article;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("org.spring.onlineblogingbackend");
		context.refresh();
		articleDAO = (ArticleDAO) context.getBean("articleDAO");

	}

	/*
	@Test
	public void testCURDProduct() {
		// create operation

		// for date and time
		Date date = new Date();
		//System.out.println("Time and date is " + date);

		article = new Article();

		article.setName("PHP");
		article.setDescription("This is some description for PHP Languages!");
		article.setPostdatetime(date);
		article.setActive(true);
		article.setCategoryId(1);
		article.setUserId(3);

		//System.out.println(article.toString());

		assertEquals("Something went wrong while inserting a new article!", true, articleDAO.add(article));

		// reading and updating the category
		article = articleDAO.get(2);

		article.setName("Java Tutorials");
		assertEquals("Something went wrong while updating the existing record!", true, articleDAO.update(article));

		assertEquals("Something went wrong while deleting the existing record!", true, articleDAO.delete(article));

		// list
		assertEquals("Something went wrong while fetching the list of articles!", 4, articleDAO.list().size());

	}
	
	*/
	
	//Business Method test case
	
	//get List Active Articles
	
	  @Test 
	  public void testListActiveArticles() {
	  
	  assertEquals("Something went wrong while fetching the list of articles!", 2,articleDAO.listActiveArticles().size());
	  
	  }
	  
	//get List Active Articles By Category Id

	  @Test
	  public void testListActiveArticlesByCategory() {
	  
	  assertEquals("Something went wrong while fetching the list of articles!", 2, articleDAO.listActiveArticleByCategory(2).size());
	  
	  assertEquals("Something went wrong while fetching the list of articles!", 2,articleDAO.listActiveArticleByCategory(3).size());
	  
	  }
	  
	  //get Latest Active Articles
	  
	  @Test
	  public void testGetLatestActiveArticles() {
	  
	  assertEquals("Something went wrong while fetching the list of articles!", 2, articleDAO.getLatestActiveArticles(2).size());
	  
	 
	  
	  }
	 
	
	

}
