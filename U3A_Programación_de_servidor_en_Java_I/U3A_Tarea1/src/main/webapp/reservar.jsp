<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RESERVAR</title>
</head>
<body>
	<jsp:include page="barra.jsp"></jsp:include>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-6">
			
				<form method="post">
					
					<h1>DATOS DE LA RESERVA</h1>
					
					<p>
					<label class="form-label" for="fechainicio">Fecha de Inicio:</label></br>
					<input class="form-control" type="date" name="fechainicio" required/>
				</p>
				
				<p>
					<label class="form-label" for="fechafin">Fecha de Fin:</label></br>
					<input class="form-control" type="date" name="fechafin" required/>
				</p>
				
				<p>
					<label class="form-label" for="nombre">Número de personas:</label></br>
					<input class="form-control" type="number" name="personas" required/>
				</p>
				
					
					<h3>SERVICIOS</h3>
					
					Wifi:<input type="checkbox" name="servicios" value="wifi">
					Toallas:<input type="checkbox" name="servicios" value="toallas">
					Desayuno:<input type="checkbox" name="servicios" value="desayuno">
					Limpieza:<input type="checkbox" name="servicios" value="limpieza">
					Ruta guiada:<input type="checkbox" name="servicios" value="ruta">
					Sauna:<input type="checkbox" name="servicios" value="sauna">

					<p><input class="btn btn-primary w-100 mt-3" type="submit" value="RESERVAR"/></p>			
										
				</form>
			</div>
		</div>
	</div>	
</body>
</html>