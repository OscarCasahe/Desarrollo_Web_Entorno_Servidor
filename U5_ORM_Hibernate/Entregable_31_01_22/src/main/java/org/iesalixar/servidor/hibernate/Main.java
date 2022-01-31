package org.iesalixar.servidor.hibernate;

import org.hibernate.Session;
import org.iesalixar.servidor.hibernate.model.Comments;
import org.iesalixar.servidor.hibernate.model.Post;
import org.iesalixar.servidor.hibernate.model.User;
import org.iesalixar.servidor.hibernate.model.Valoracion;
import org.iesalixar.servidor.hibernate.services.CommentsService;
import org.iesalixar.servidor.hibernate.services.CommentsServiceImpl;
import org.iesalixar.servidor.hibernate.services.PostService;
import org.iesalixar.servidor.hibernate.services.PostServiceImpl;
import org.iesalixar.servidor.hibernate.services.UserService;
import org.iesalixar.servidor.hibernate.services.UserServiceImpl;
import org.iesalixar.servidor.hibernate.utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();

		// Creo los servicios definidos
		UserService userService = new UserServiceImpl(session);
		CommentsService commentsService = new CommentsServiceImpl(session);
		PostService postService = new PostServiceImpl(session);
		ValoracionService valoracionService = new ValoracionServiceImpl(session);
		
		//Creo los objetos necesarios
		User u1 = new User();
		u1.setUsername("Óscar");
		u1.setPassword("root");
		
		User u2 = new User();
		u2.setUsername("Ines");
		u2.setPassword("root");
		
		
		//Persisto las usuarios
		UserService.insertNewUser(u1);
		UserService.insertNew_User(u2);
		
		
		
		//Creo dos departamentos para cada empresa
		Post p1 = new Post();
		p1.setTitle("titulo1");
		p1.setContent("Este es el titulo");
		
		Post p2 = new Post();
		p1.setTitle("titulo2");
		p1.setContent("Este es el titulo");
		
		Post p3 = new Post();
		p1.setTitle("titulo3");
		p1.setContent("Este es el titulo");
		
		Post p4 = new Post();
		p1.setTitle("titulo4");
		p1.setContent("Este es el titulo");
		
		Post p5 = new Post();
		p1.setTitle("titulo5");
		p1.setContent("Este es el titulo");
		
		
		//Persisto los posts

		PostService.insertNewPost(p1);
		PostService.insertNewPost(p2);
		PostService.insertNewPost(p3);
		PostService.insertNewPost(p4);
		PostService.insertNewPost(p5);
		
		
		
		//Creo comentarios
		Comments c1 = new Comments();
		c1.setTitle("comentario 1");
		c1.setContent("Dentro del comentario 1");
		
		Comments c2 = new Comments();
		c2.setTitle("comentario 2");
		c2.setContent("Dentro del comentario 2");
		
		Comments c3 = new Comments();
		c3.setTitle("comentario 3");
		c3.setContent("Dentro del comentario 3");
		
		
		//Persisto los comments

		CommentsService.insertNewComments(c1);
		CommentsService.insertNewComments(c2);
		CommentsService.insertNewComments(c3);
		
		// Valoraciones
		
		Valoracion v1 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		Valoracion v2 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		Valoracion v3 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		Valoracion v4 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		Valoracion v5 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		Valoracion v6 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		Valoracion v7 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		
		Valoracion v8 = new Valoracion();
		v1.setUser(u1);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		
		
		Valoracion v9 = new Valoracion();
		v1.setUser(u2);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		
		
		Valoracion v10 = new Valoracion();
		v1.setUser(u2);
		v1.setPost(p1);
		v1.setPuntuacion(3);
		
		
		//persistir
		
		ValoracionService.insert
		
		
	}
	
}
