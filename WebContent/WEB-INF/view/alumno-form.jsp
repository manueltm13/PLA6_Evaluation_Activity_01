<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<!-- >meta charset="ISO-8859-1"-->
		<title>Alta alumnos</title>
        <meta name="author" content="Manuel García Criado, 2019"/>
        <meta name="description" content="Formulario alumno"/>
        <meta name="format-detection" content="telephone=no"/>
        <meta name="msapplication-tap-highlight" content="no"/>
        <meta name="viewport" content="user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width"/>
        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" /> <!--Utilitzar la ultima versio de l'explorer installada -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js" type="text/javascript" /></script>
		<script src="<c:url value="/resources/js/alumno-form.js" />" type="text/javascript" /></script>
	</head>
	<body>
		<h1>Alta Alumnos</h1>
		<form:form action="procesar" modelAttribute="alumno">
			<div>
				<label for="nombre">Nombre:</label>
				<form:input path="nombre"/>
				<form:errors path="nombre" cssClass="error" />
			</div>
			<div>
				<label for="dni">DNI:</label>
				<form:input path="dni"/>
				<form:errors path="dni" cssClass="error" />
			</div>
			<div>
				<label for="email">Email:</label>
			    <form:input path="email"/>
				<form:errors path="email" cssClass="error" />
			</div>
			<div>
				<label for="becado">Becado:</label>
			   	<form:radiobuttons path="becado" items="${ alumno.siNo}" />
			</div>
			<div>
				<label for="asignaturas">Asignaturas:</label>
				<form:checkboxes path="asignaturas" items="${alumno.listaAsignaturas}" />
			</div>
			<input type="submit">
		</form:form>
	</body>
</html>