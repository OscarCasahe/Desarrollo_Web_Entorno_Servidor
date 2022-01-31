package org.iesalixar.servidor.hibernate.dao;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.model.Valoracion;
import org.iesalixar.servidor.hibernate.utils.dao.GenericDAOImpl;

public class ValoracionDAOImp extends GenericDAOImpl<Valoracion> implements ValoracionDAO {


	private Session session;
		
	public ValoracionDAOImp(Session session) {
		super(session);
		this.session = session;
	}

	

}
