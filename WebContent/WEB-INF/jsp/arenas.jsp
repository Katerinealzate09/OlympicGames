<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Arenas</title>
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

	<div class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a href="home"><img class="icon img-responsive"
					src="http://lorempixel.com/500/500/"></a>
			</div>
			<div class="navbar-right">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="arenas">Arenas</a></li>
					<li class="inactive"><a href="athletes">Atletas</a></li>
					<li class="inactive"><a href="#">Medallas</a></li>
					<li class="inactive"><a href="news">Noticias</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1 class="text-center">
						<b>Arenas Juegos Olimpicos Río 2016</b>
					</h1>
					<h2 class="col-md-8 col-md-offset-2 text-center">Un Nuevo
						Mundo</h2>
				</div>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<c:forEach var="dto" items="${command}">
					<div class="items">
						<div class="item col-md-3">
							<div class="imagen">
								 <a href="${dto.url}"><img src="${dto.image}"
									class="center-block img-responsive img-thumbnail">
									<h1 class="text-center">${dto.title}</h1>
								</a>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>