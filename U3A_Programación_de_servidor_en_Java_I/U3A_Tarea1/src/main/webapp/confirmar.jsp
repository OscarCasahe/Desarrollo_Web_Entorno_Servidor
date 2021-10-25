<%@page import="iesalixar.server.controller.model.Reserva"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CONFIRMAR</title>
</head>
<body>

<jsp:include page="barra.jsp"></jsp:include>

<p><span class="fw-bold">Nombre:</span><%= ((String)session.getAttribute("fechainicio")) %></p>
				<p><span class="fw-bold">Apellidos:</span><%= ((String)session.getAttribute("fechafin")) %></p>
				<p><span class="fw-bold">Email:</span><%= ((String)session.getAttribute("personas")) %></p>
				<p><span class="fw-bold">Curso:</span><%= (String)request.getAttribute("servicios") %></p>
				<h4>Módulos</h4>
				<ul>

					<%
					String[] servicios = (String[]) session.getAttribute("servicios");

					if (servicios.length == 0) {
					%>

					<li>No hay servicios reservados</li>l
					<%
					} else {
					%>
						<% for (int i=0;i<servicios.length;i++) { %>
							<li><%= servicios[i] %></li>
						<% } %>
					<%
					}
					%>

</body>
</html>