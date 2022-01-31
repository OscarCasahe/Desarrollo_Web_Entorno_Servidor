package org.iesalixar.servidor.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.model.User;
import org.iesalixar.servidor.hibernate.utils.HibernateUtils;
import org.iesalixar.servidor.hibernate.utils.dao.GenericDAOImpl;

public class UserDAOImp extends GenericDAOImpl<User> implements UserDAO {

	private Session session;
		
	public UserDAOImp(Session session) {
		super(session);
		this.session = session;
	}

	

}
