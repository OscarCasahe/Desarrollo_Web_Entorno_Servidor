<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INICIO</title>
</head>
<body>

	<div class="container">
		<div class="row justify-content-center mt-5">
			<% if (!session.isNew() && session.getAttribute("LOGEADO")!=null && ((boolean)session.getAttribute("LOGEADO")) ) { %>
			<jsp:include page="barra.jsp"></jsp:include>
			
			<!-- ELEMENTOS DE LA PÁGINA QUE SE SACAN SI ESTAMOS LOGEADOS -->
			<div class="col-3">
				<a href="<%= request.getContextPath()+"/Logout" %>"><input type="button" class="btn btn-primary w-100" value="SALIR"></a>
				<label class="form-label" for="usuario">Usuario:<%request.getParameter("usuario"); %></label>
				<label class="form-label" for="sesion">Sesion:</label></br>
				
			</div>

			<% } else { %>

			<!-- ELEMENTOS DE LA PÁGINA QUE SE SACAN SI NO ESTAMOS LOGEADOS -->
			<div class="col-3">
				<form method="post">
				<h1>CENTRAL DE VIAJES</h1>
				<p>
					<label class="form-label" for="nombre">Usuario:</label></br>
					<input class="form-control" type="text" name="usuario" required/>
				</p>
				
				<p>
					<label class="form-label" for="nombre">Password:</label></br>
					<input class="form-control" type="password" name="password" required/>
				</p>
				
				<p>
					<label class="form-label" for="nombre">Confirmar Password:</label></br>
					<input class="form-control" type="password" name="confirmacion" required/>
				</p>
				
				<p>
					<label class="form-label" for="nombre">Email:</label></br>
					<input class="form-control" type="email" name="email" required/>
				</p>
					<input name="registrarse" type="submit" class="btn btn-primary w-100" value="REGISTRARSE" />
				</form>
			</div>
			<% } %>
		</div>
	</div>
	</div>
</body>
</html>