package iesalixar.server.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import iesalixar.server.controller.model.Reserva;

/**
 * Servlet implementation class Confirmar
 */
@WebServlet("/Confirmar")
public class Confirmar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();

		
		if (!sesion.isNew() && sesion.getAttribute("LOGEADO") != null && ((boolean) sesion.getAttribute("LOGEADO"))) {
			
			Reserva nuevaReserva = (Reserva) request.getAttribute("reserva");
			

			
			request.getRequestDispatcher("matricular.jsp").forward(request, response);			
			return;
			
		}else {
		
		
		sesion.invalidate();
		response.sendRedirect(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}}
