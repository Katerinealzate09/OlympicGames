<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>News</title>
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
	<!-- NAVBAR -->
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

					<li class="nav-item"><a class="nav-link" href="medal">Medallas</a>
					</li>
					<li class="active"><a class="nav-link" href="news">Noticias
							<span class="sr-only">(current)</span>
					</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--TITLE-->
	<div class="row">
		<div class="col-md-12 text-center">
			<h1>Noticias</h1>
		</div>
	</div>
	<!-- POSTS -->
	<div class="container">
		<div class="posts row">
			<!-- POST -->
			<c:forEach var="dto" items="${command}">
				<div class="post col-md-12">
					<div class="content-post col-md-12">
						<div class="number col-md-3 ">
							<img class="bullet-point center-block img-responsive noticia" src="${dto.image}" alt="">
						</div>
						<div class="message-post col-md-9">
							<h3>${dto.title}</h3>
							<h5>${dto.description}</h5>
							<a href="${dto.newsUrl}"><h6  class="text-right">Ver mas</h6></a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>