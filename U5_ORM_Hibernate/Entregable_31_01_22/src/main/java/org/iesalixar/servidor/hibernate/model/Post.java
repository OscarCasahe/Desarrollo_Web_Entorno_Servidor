package org.iesalixar.servidor.hibernate.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="post")
public class Post implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	@Column
	private Date date;

	
	//relación con valoración
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Valoracion> valoraciones = new HashSet<>();
	
	//relación con valoración
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Comments> comments = new HashSet<>();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//relación con user
	@ManyToOne
	@JoinColumn(name="comments")
	private User user;
	
	public Post(String title, String content, Date date) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public Post() {
		super();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Set<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public Set<Comments> getComments() {
		return comments;
	}

	public void setComments(Set<Comments> comments) {
		this.comments = comments;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, content, date, id, title, valoraciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(comments, other.comments) && Objects.equals(content, other.content)
				&& Objects.equals(date, other.date) && Objects.equals(id, other.id)
				&& Objects.equals(title, other.title) && Objects.equals(valoraciones, other.valoraciones);
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", date=" + date + ", valoraciones="
				+ valoraciones + ", comments=" + comments + "]";
	}

	// Métodos Helpers Post
	public void addComment(Comments comment) {
		this.comments.add(comment);
		comment.setPost(this);
	}

	public void removeComment(Comments comment) {
		this.comments.remove(comment);
		comment.setPost(null);
	}
	
	
	
}
