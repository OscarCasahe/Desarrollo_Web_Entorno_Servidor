package org.iesalixar.servidor.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.model.Comments;
import org.iesalixar.servidor.hibernate.model.Post;
import org.iesalixar.servidor.hibernate.utils.HibernateUtils;
import org.iesalixar.servidor.hibernate.utils.dao.GenericDAOImpl;

public class CommentsDAOImp extends GenericDAOImpl<Comments> implements CommentsDAO{

	private Session session;
	
	public CommentsDAOImp(Session session) {
		super(session);
		this.session = session;
	}


}
