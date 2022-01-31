package org.iesalixar.servidor.hibernate.services;

import java.util.List;

import org.iesalixar.servidor.hibernate.model.Comments;


public interface CommentsService {

	
	public void insertNewComments(final Comments comment);	
	 
	public void updateComments(final Comments comment);	
	
	public void deleteComments(final Comments comment);
	
	public Comments searchById(final Long commentId);
	
	public List<Comments> searchAll();
	
}
