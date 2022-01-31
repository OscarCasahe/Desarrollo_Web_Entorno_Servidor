package org.iesalixar.servidor.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.model.Post;
import org.iesalixar.servidor.hibernate.model.User;
import org.iesalixar.servidor.hibernate.utils.HibernateUtils;
import org.iesalixar.servidor.hibernate.utils.dao.GenericDAOImpl;

public class PostDAOImp extends GenericDAOImpl<Post> implements PostDAO{

	private Session session;
	
	public PostDAOImp(Session session) {
		super(session);
		this.session = session;
	}
	



}
