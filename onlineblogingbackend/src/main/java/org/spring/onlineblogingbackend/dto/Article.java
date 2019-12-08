package org.spring.onlineblogingbackend.dto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "article")
public class Article {

	// Default Constructor for code
	// like ARTCARTY457896OUI
	public Article() {

		this.code = "ARTC" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	// getter N setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPostdatetime() {
		return postdatetime;
	}

	public void setPostdatetime(Date postdatetime) {
		this.postdatetime = postdatetime;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	// error debugging code

	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description
				+ ", postdatetime=" + postdatetime + ", active=" + active + ", categoryId=" + categoryId + ", userId="
				+ userId + ", purchases=" + purchases + ", views=" + views + "]";
	}

	// Private fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String code;
	private String name;

	// blob dataType field in mysql
	private String description;

	// for date Time
	// @Temporal(TemporalType.DATE)
	// @Temporal(TemporalType.TIME)
	// @Temporal(TemporalType.TIMESTAMP)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "post_dateTime")
	private Date postdatetime;

	@Column(name = "is_active")
	private boolean active;

	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "user_id")
	private int userId;
	private int purchases;
	private int views;

}
