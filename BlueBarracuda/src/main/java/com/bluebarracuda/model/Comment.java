package com.bluebarracuda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class Comment {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "User_FK")
	User user;
	
	@Id
	@Column(name="comment_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int commentId; 
	
	@Column(name="comment")
	private String comment;	
	
	@Column(name="rating", nullable=true)
	private Ratings rating;
	
	public Comment() {
		
	}
	public Comment(User user, String comment, Ratings rating, int commentId) {
		super();
		this.user = user;
		this.comment = comment;
		this.rating = rating;
		this.commentId=commentId;
	}
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Ratings getRating() {
		return rating;
	}
	public void setRating(Ratings rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Comment [user=" + user + ", comment=" + comment + ", rating=" + rating + "]";
	}
	
	
}
