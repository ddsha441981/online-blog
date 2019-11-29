package org.sping.onlineblogingbackend.dto;

public class Category {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripation() {
		return descripation;
	}

	public void setDescripation(String descripation) {
		this.descripation = descripation;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", descripation=" + descripation + ", imageUrl=" + imageUrl
				+ ", active=" + active + "]";
	}



	/** private Fields */

	private int id;
	private String name;
	private String descripation;
	private String imageUrl;
	private boolean active = true;

}
