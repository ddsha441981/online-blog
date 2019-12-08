package org.spring.onlineblogingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.spring.onlineblogingbackend.dao.ArticleDAO;
import org.spring.onlineblogingbackend.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("articleDAO")
@Transactional
public class ArticleDAOImpl implements ArticleDAO {

	//sessionFactory
	@Autowired
	SessionFactory sessionFactory;
	
	//single article
	@Override
	public Article get(int articleid) {
		
		try {
			
			return sessionFactory.getCurrentSession().get(Article.class,Integer.valueOf(articleid));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}

	//List 
	@Override
	public List<Article> list() {
		
		//Here Article is dto class name not table name
		
		return sessionFactory.getCurrentSession().createQuery("FROM Article" , Article.class).getResultList();
	}

	
	//Insert
	@Override
	public boolean add(Article article) {
		try {
			
			
			sessionFactory.getCurrentSession().persist(article);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	
	//update
	@Override
	public boolean update(Article article) {
		
		try {
			
			sessionFactory.getCurrentSession().update(article);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return false;
	}

	//delete
	@Override
	public boolean delete(Article article) {
		
		try {
			
			article.setActive(false);
			//call the update method
			return this.update(article);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	//Bushiness Method
	@Override
	public List<Article> listActiveArticles() {
		//System.out.println("in method");
		//Here Article is dto class name not table name
		
		String selectActiveArticles = "FROM Article WHERE active = :active";
		System.out.println("+++++++++++++++++++++++++++++++"+selectActiveArticles);
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveArticles, Article.class)
						.setParameter("active", true)
							.getResultList();
		
		
	}

	@Override
	public List<Article> listActiveArticleByCategory(int categoryId) {

		//Here Article is dto class name not table name
		String selectActiveCategory = "FROM Article WHERE active = :active AND categoryId = :categoryId";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveCategory, Article.class)
						.setParameter("active", true)
							.setParameter("categoryId", categoryId)
								.getResultList();

	}

	@Override
	public List<Article> getLatestActiveArticles(int count) {
		
		//Here Article is dto class name not table name
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Article WHERE active = :active ORDER BY id", Article.class)
						.setParameter("active", true)
							.setFirstResult(0)
								.setMaxResults(count)
									.getResultList();
	}

}
