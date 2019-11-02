<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<!-- >meta charset="ISO-8859-1"-->
		<title>Alumno</title>
        <meta name="author" content="Manuel García Criado, 2019"/>
        <meta name="description" content="Ver datos alumno"/>
        <meta name="format-detection" content="telephone=no"/>
        <meta name="msapplication-tap-highlight" content="no"/>
        <meta name="viewport" content="user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width"/>
        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" /> <!--Utilitzar la ultima versio de l'explorer installada -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
	</head>
	<body>
		<h1>Alumno</h1>
		<form:form action="#" modelAttribute="alumno">
			<div>
				<label for="nombre">Nombre:</label>
				<form:input path="nombre" disabled="true"/>
			</div>
			<div>
				<label for="dni">DNI:</label>
				<form:input path="dni" disabled="true"/>
			</div>
			<div>
				<label for="email">Email:</label>
			    <form:input path="email" disabled="true"/>
			</div>
			<div>
				<label for="becado">Becado:</label>
				<input value=${alumno.becado == "S" ? "Sí" : "No"} disabled />
			</div>
			<div>
				<label>Asignaturas:</label>
				<ul>
					<c:forEach var="asign" items="${alumno.asignaturas}">
						<li>${asign}</li>
					</c:forEach>
				</ul>
				<!-- form:checkboxes path="asignaturas" items="${alumno.listaAsignaturas}" disabled="true"/-->
			</div>
		</form:form>
	</body>
</html>