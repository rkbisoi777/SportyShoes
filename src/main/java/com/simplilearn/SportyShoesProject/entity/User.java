package com.simplilearn.SportyShoesProject.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name = "user")
@Table(name="user")
public class User extends BaseEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public long userId;
	public String username;
	public String emailId;
	public String phone;
	public String productPurchased;
	public Date purchaseDate;
	public String category;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String username, String emailId, String phone, String productPurchased,
			Date purchaseDate, String category) {
		super();
		this.userId = userId;
		this.username = username;
		this.emailId = emailId;
		this.phone = phone;
		this.productPurchased = productPurchased;
		this.purchaseDate = purchaseDate;
		this.category = category;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProductPerchased() {
		return productPurchased;
	}
	public void setProductPerchased(String productPurchased) {
		this.productPurchased = productPurchased;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date perchaseDate) {
		this.purchaseDate = perchaseDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", emailId=" + emailId + ", phone=" + phone
				+ ", productPerchased=" + productPurchased + ", purchaseDate=" + purchaseDate + ", category=" + category
				+ "]";
	}
	

}
