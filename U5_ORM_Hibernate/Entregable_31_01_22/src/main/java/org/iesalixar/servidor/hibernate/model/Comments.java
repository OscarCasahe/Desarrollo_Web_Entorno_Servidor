package org.iesalixar.servidor.hibernate.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="comments")
public class Comments implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	
	//relación con user
	@ManyToOne
	@JoinColumn(name="comments")
	private User user;
	
	//relación con comments
	@ManyToOne
	@JoinColumn(name="comments")
	private Post post;

	
	
	public Comments(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public Comments() {
		super();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, id, post, title, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comments other = (Comments) obj;
		return Objects.equals(content, other.content) && id == other.id && Objects.equals(post, other.post)
				&& Objects.equals(title, other.title) && Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "Comments [id=" + id + ", title=" + title + ", content=" + content + ", user=" + user + ", post=" + post
				+ "]";
	}
	
	
	
	


	
	
	
}
