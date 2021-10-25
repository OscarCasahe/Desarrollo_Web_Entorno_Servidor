package iesalixar.server.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Reservar
 */
@WebServlet("/Reservar")
public class Reservar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();

		if (!sesion.isNew() && sesion.getAttribute("LOGEADO") != null && ((boolean) sesion.getAttribute("LOGEADO"))) {

			request.getRequestDispatcher("reservar.jsp").forward(request, response);

			return;
		}
		sesion.invalidate();
		response.sendRedirect(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HttpSession sesion = request.getSession();


		if (!sesion.isNew() && sesion.getAttribute("LOGEADO")!= null && ((boolean) sesion.getAttribute("LOGEADO"))) {
			
		
			if (request.getParameter("fechainicio")!=null && request.getParameter("fechafin")!=null
					&& request.getParameter("personas")!=null ) {
				
				sesion.setAttribute("fechaI", request.getParameter("fechainicio"));
				sesion.setAttribute("fechaF", request.getParameter("fechafinal"));
				sesion.setAttribute("numPersonas", request.getParameter("personas"));				
				sesion.setAttribute("serviciosR", request.getParameterValues("servicios"));
				
				response.sendRedirect(request.getContextPath()+"/Confirmar");				
				return;
				
			} else {

				
				response.sendRedirect(request.getContextPath()+"/Reservar");
				return;
				
			}
		
	}

	}}
