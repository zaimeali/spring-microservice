package com.zaime.moviecatalogservice.models;


public class CatalogItem {

	private String userID;
	private String name;
	private String desc;
	private int rating;
	
	public CatalogItem() {}
	
	public CatalogItem(String name, String desc, int rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	
	public CatalogItem(String userID, String name, String desc, int rating) {
		this.userID = userID;
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
