<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	
	<!-- CSS library -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
		
	<!-- Optional theme -->	
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" />	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	
	
	<!-- style define -->
	<style>
		@import url(http://fonts.googleapis.com/css?family=Roboto);
		
		/*****Login Modal*****/
		.loginmodal{
		
		}
		
		.loginmodal-container{
		
		}
		
		.loginmodal-container h1{
		
		}
		
		.loginmodal-container a{
		
		}
		
		.loginmodal-container input[type=submit]{
		
		}
		
		.loginmodal-container input[type=text], input[type=password]{
		
		}
		
		.loginmodal-container input[type=text]:hover, input[type=password]:hover{
		
		}
		
		.loginmodal-submit{
		
		}
		
		.loginmodal-submit:hover{
		
		}
		
		.loginmodal-help{
		
		}
		
		.dropdown:hover .dropdown-menu{
		
		}	
	</style>
	
	<title>Home</title>
	
	<!-- Login Check -->
	
	
	<!-- Login - YES -->
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
		
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand page-scroll"  href="/engrZebra/" style="font-family: fantasy;">
					ZEBRA
				</a>
			</div>
			
			<!-- link other page -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li class="hidden"><a class="page-scroll" href="#page-top"></a></li>
					<li><a class="page-scroll" href="/engrZebra/">About Service</a></li>
					<li><a class="page-scroll" href="/engrZebra/">Power Reviewer</a></li>
					<li><a class="page-scroll" href="/engrZebra/">Product</a></li>
					<li><a class="page-scroll" href="/engrZebra/">Our Product</a></li>
					<li><a class="page-scroll" href="/engrZebra/">Management</a></li>
				</ul>
			
				<ul class="nav navbar-nav navbar-right">
					<li>
						<a href="#" data-toggle="modal" data-target="#">
							<span class="glyphicon glyphicon-user"></span>	
						</a>
					</li>
					<li>
						<a href="/engrZebra/logout">
							<span class="glyphicon glyphicon-log-in"></span>
						</a>
					</li>
				</ul>
			</div>	
		</div>
	</nav>
	
	<!-- Login - NO -->
	
</head>
<body>
</body>
</html>