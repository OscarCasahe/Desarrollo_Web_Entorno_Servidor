package org.iesalixar.servidor.hibernate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue
	private  Long id;
	
	@Column(unique = true)
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String email;
	
	
	//relación con valoración
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Valoracion> valoraciones = new HashSet<>();
	
	//relación con comments
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Comments> comments = new HashSet<>();
	
	//relación con post
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Post> posts = new HashSet<>();
	
	

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

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public User(String username, String password, String firstName, String lastName, String email) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public User() {
		super();
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, email, firstName, id, lastName, password, posts, username, valoraciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(comments, other.comments) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& Objects.equals(posts, other.posts) && Objects.equals(username, other.username)
				&& Objects.equals(valoraciones, other.valoraciones);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", valoraciones=" + valoraciones + ", comments="
				+ comments + ", posts=" + posts + "]";
	}


	
	// Métodos Helpers Valoracion
	public void addValoracion(Post post, int puntuacion) {
		Valoracion valoracion = new Valoracion(this, post, puntuacion);
		this.valoraciones.add(valoracion);
		post.getValoraciones().add(valoracion);
	}

	public void removeValoracion(Post post) {
		Valoracion valoracion = new Valoracion(post, this);
		post.getValoraciones().remove(valoracion);
		this.valoraciones.remove(valoracion);
	}
	
	
	// Métodos Helpers Comments
	public void addComments(Comments comment) {
		this.comments.add(comment);
		comment.setUser(this);
	}

	public void removeComments(Comments comment) {
		this.comments.remove(comment);
		comment.setUser(null);
	}
	
	// Métodos Helpers Post
	public void addPost(Post post) {
		this.posts.add(post);
		post.setUser(this);
	}

	public void removePost(Post post) {
		this.comments.remove(post);
		post.setUser(null);
	}
	
	
	

}
