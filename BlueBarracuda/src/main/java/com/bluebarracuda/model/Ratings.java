package com.bluebarracuda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import com.bluebarracuda.model.User;

@Entity
@Table(name="Ratings")
public class Ratings {
	
	@Id
	@Column(name="ratingId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int ratingId;
	
	@Column(name="user")
	User user;
	
	@Column(name="like")
	int likes;
	
	@Column(name="dislikes")
	int dislikes;
	
	public Ratings() {
		
	}
	
	public Ratings(User user, int likes, int dislikes, int ratingId) {
		super();
		this.user = user;
		this.likes = likes;
		this.dislikes = dislikes;
		this.ratingId = ratingId;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	@Override
	public String toString() {
		return "Ratings [user=" + user + ", likes=" + likes + ", dislikes=" + dislikes + "]";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	
	
}

