package org.iesalixar.servidor.hibernate.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.dao.CommentsDAO;
import org.iesalixar.servidor.hibernate.dao.CommentsDAOImp;
import org.iesalixar.servidor.hibernate.model.Comments;


public class CommentsServiceImpl implements CommentsService {

	private CommentsDAO commentsDao;

	public CommentsServiceImpl(final Session session) {
		this.commentsDao = new CommentsDAOImp(session);
		
	}
	
	@Override
	public void insertNewComments(Comments comments) {


		if (comments != null && comments.getId() == null) {
			// Inserción del pedido
			commentsDao.insert(comments);
		}

	}

	@Override
	public void updateComments(Comments comments) {
		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (comments != null && comments.getId() != null) {

			// Actualizo el pedido
			commentsDao.update(comments);
		}

	}

	@Override
	public void deleteComments(Comments comments) {
		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (comments != null && comments.getId() != null) {

			// Actualizo el pedido
			commentsDao.delete(comments);
		}
	}

	@Override
	public Comments searchById(Long commentsId) {
		Comments comments = null;

		if (commentsId != null) {

			comments = commentsDao.searchById(commentsId);
		}

		return comments;
	}

	@Override
	public List<Comments> searchAll() {
		
		List<Comments> commentsList = new ArrayList<Comments>();

		commentsList = commentsDao.searchAll();

		return commentsList;
	}


	

	

	
}
