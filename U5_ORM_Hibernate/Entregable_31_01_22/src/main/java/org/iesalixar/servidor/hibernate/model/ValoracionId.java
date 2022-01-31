package org.iesalixar.servidor.hibernate.model;

import java.util.Objects;

public class ValoracionId {

	private Long post;
	private Long user;
	
	public ValoracionId() {
		super();
	}

	public Long getPost() {
		return post;
	}

	public void setPost(Long post) {
		this.post = post;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(post, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValoracionId other = (ValoracionId) obj;
		return post == other.post && user == other.user;
	}

	@Override
	public String toString() {
		return "ValoracionId [post=" + post + ", user=" + user + "]";
	}
	
	
	
}
