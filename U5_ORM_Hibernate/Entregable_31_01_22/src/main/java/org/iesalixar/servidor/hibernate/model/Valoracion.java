package org.iesalixar.servidor.hibernate.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.security.auth.Subject;


@Entity
@IdClass(ValoracionId.class)
public class Valoracion implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name="post",insertable = false, updatable = false)
	private Post post;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="user",insertable = false, updatable = false)
	private User user;
	
	
	private int puntuacion;


	public Valoracion(Post post, User user, int puntuacion) {
		super();
		this.post = post;
		this.user = user;
		this.puntuacion = puntuacion;
	}


	public Valoracion() {
		super();
	}



	public Valoracion(Post post, User user) {
		super();
		this.post = post;
		this.user = user;
	}


	public Valoracion( User user, Post post, int puntuacion) {
		super();
		this.post = post;
		this.user = user;
		this.puntuacion = puntuacion;
	}


	public Post getPost() {
		return post;
	}


	public void setPost(Post post) {
		this.post = post;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(post, puntuacion, user);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valoracion other = (Valoracion) obj;
		return Objects.equals(post, other.post) && puntuacion == other.puntuacion && Objects.equals(user, other.user);
	}


	@Override
	public String toString() {
		return "Valoracion [post=" + post + ", user=" + user + ", puntuacion=" + puntuacion + "]";
	}
	
	
}
