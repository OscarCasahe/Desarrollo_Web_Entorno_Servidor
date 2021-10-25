package iesalixar.server.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		if (request.getParameter("usuario")!=null && request.getParameter("password")!=null
				&& request.getParameter("confirmacion")!=null && request.getParameter("email")!=null &&
				request.getParameter("password").equals(request.getParameter("confirmacion")) && request.getParameter("password").length()<8
				 && request.getParameter("password").length()>=6 && request.getParameter("password").contains("*") ||
				 request.getParameter("password").contains("!") || request.getParameter("password").contains("?")  ) {
			
			
			HttpSession sesion = request.getSession();
			
			sesion.setAttribute("LOGEADO", true);
			sesion.setAttribute("usuario", request.getParameter("usuario"));
			sesion.setAttribute("sesion", sesion.getCreationTime());
			
			response.sendRedirect(request.getContextPath()+"/Reservar");
			
			return;
		}
		
		response.sendRedirect(request.getContextPath());
		
	}

}
