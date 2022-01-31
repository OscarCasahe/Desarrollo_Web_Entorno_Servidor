package org.iesalixar.servidor.hibernate.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.dao.PostDAO;
import org.iesalixar.servidor.hibernate.dao.PostDAOImp;
import org.iesalixar.servidor.hibernate.model.Post;


public class PostServiceImpl implements PostService {

	private PostDAO postDao;

	public PostServiceImpl(final Session session) {
		this.postDao = new PostDAOImp(session);
		
	}
	
	@Override
	public void insertNewPost(Post post) {


		if (post != null && post.getId() == null) {
			// Inserción del pedido
			postDao.insert(post);
		}

	}

	@Override
	public void updatePost(Post post) {
		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (post != null && post.getId() != null) {

			// Actualizo el pedido
			postDao.update(post);
		}

	}

	@Override
	public void deletePost(Post post) {
		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (post != null && post.getId() != null) {

			// Actualizo el pedido
			postDao.delete(post);
		}
	}

	@Override
	public Post searchById(Long postId) {
		Post post = null;

		if (postId != null) {

			post = postDao.searchById(postId);
		}

		return post;
	}

	@Override
	public List<Post> searchAll() {
		
		List<Post> postList = new ArrayList<Post>();

		postList = postDao.searchAll();

		return postList;
	}


	

	

	
}
