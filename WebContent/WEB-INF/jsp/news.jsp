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
	<div class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a href="home" ><img class="icon img-responsive" 
					src="http://lorempixel.com/500/500/"></a>
			</div>
			<div class="navbar-right">
				<ul class="nav navbar-nav navbar-right">
					<li class="inactive"><a href="arenas">Arenas</a></li>
					<li class="inactive"><a href="athletes">Atletas</a></li>
					<li class="inactive"><a href="#">Medallas</a></li>
					<li class="active"><a href="news">Noticias</a></li>
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
						<div class="number col-md-1 ">
							<img class="bullet-point center-block" src="${dto.image}" alt="">
						</div>
						<div class="message-post col-md-11">
							<h3>${dto.title}</h3>
							<h5>${dto.description}</h5>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>