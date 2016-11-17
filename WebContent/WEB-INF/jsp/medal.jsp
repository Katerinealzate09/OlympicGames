<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Medal</title>
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
	rel="stylesheet" type="text/css">
<link href="resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="navbar navbar-light navbar-static-top"
		style="background-color: #F9FAFA;">
		<div class="container">
			<div class="navbar-header" class="navbar-brand">
				<a href="home"><img src="resources/img/Logo.png" width="50"
					height="45"> </a> <a href="home"><span
					class="navbar-text navbar-right ">Juegos Olimpicos 2016</span></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-ex-collapse">
				<ul class="nav nav-tabs navbar-right">
					<li class="nav-item"><a class="nav-link" href="arenas">Arenas</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="athletes">Atletas</a>
					</li>
					<li class="active"><a class="nav-link" href="medal">Medallas
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="news">Noticias</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!--TITLE-->
	<div class="row">
		<div class="col-md-12 text-center">
			<h1>Medallas</h1>
		</div>
	</div>
	<div class="container" id="content">
		<!-- SEARCH
		<div class="row search">
			<div class="col-md-offset-3 col-md-6">
				<form role="form">
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control" id="search-box">
							<span class="input-group-btn"> <a class="btn btn-primary"
								type="submit">Buscar</a>
							</span>
						</div>
					</div>
				</form>
			</div>
		</div> -->
		<!-- USERS -->
		<div class="row users">
			<!-- USER -->
			<c:forEach var="dto" items="${command}">
				<div class="user col-md-4 col-sm-5">
					<div class="content-user col-md-12">
						<div class="image col-md-6">
							<img src="${dto.image}"
								class="center-block img-responsive img-circle img-thumbnail">
						</div>
						<div class="name col-md-6">
							<h3 class="text-center">Nombre</h3>
							<h4 class="text-center">${dto.name}</h4>
							<h3 class="text-center">Medalla</h3>
							<h4 class="text-center">${dto.medal}</h4>
							<h3 class="text-center">Nacionalidad</h3>
							<h4 class="text-center">${dto.nationality}</h4>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>