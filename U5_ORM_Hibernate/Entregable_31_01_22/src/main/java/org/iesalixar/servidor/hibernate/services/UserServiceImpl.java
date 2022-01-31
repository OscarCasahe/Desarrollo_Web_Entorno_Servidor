package org.iesalixar.servidor.hibernate.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.dao.UserDAO;
import org.iesalixar.servidor.hibernate.dao.UserDAOImp;
import org.iesalixar.servidor.hibernate.model.User;


public class UserServiceImpl implements UserService {

	private UserDAO userDao;

	public UserServiceImpl(final Session session) {
		this.userDao = new UserDAOImp(session);
		
	}
	
	@Override
	public void insertNewUser(User user) {


		if (user != null && user.getId() == null) {
			// Inserción del pedido
			userDao.insert(user);
		}

	}

	@Override
	public void updateUser(User user) {
		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (user != null && user.getId() != null) {

			// Actualizo el pedido
			userDao.update(user);
		}

	}

	@Override
	public void deleteUser(User user) {
		// Compruebo que no es nulo y que ya existe (tiene ID)
		if (user != null && user.getId() != null) {

			// Actualizo el pedido
			userDao.delete(user);
		}
	}

	@Override
	public User searchById(Long userId) {
		User user = null;

		if (userId != null) {

			user = userDao.searchById(userId);
		}

		return user;
	}

	@Override
	public List<User> searchAll() {
		
		List<User> userList = new ArrayList<User>();

		userList = userDao.searchAll();

		return userList;
	}


	

	

	
}
