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
		
		/***** Modal*****/
		.loginmodal{
			height: 36px;
			padding: 0 8px;
			text-align: center;
			font-family: 'Arial', sans-serif;
			font-size: 14px;
			font-weight: 700;
		}
		
		.loginmodal-container{
			width: 100% !important;
			max-width: 350px;
			padding: 30px;
			margin: 0 auto;
			background-color: #F7F7F7;
			border-radius: 2px;
			box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
			overflow: hidden;
			font-family: roboto;
		}
		
		.loginmodal-container h1{
			text-align: center;
			font-size: 1.8em;
			font-family: roboto;
		}
		
		.loginmodal-container a{
			display: inline-block;
			opacity: 0.6;
			tansition: opacity ease 0.5s;
			color: #666;
			text-align: center;
			text-decoration: none;
			font-weight: 400;
			
		}
		
		.loginmodal-container input[type=submit]{
			width: 100%;
			margin-bottom: 10px;
			display: block;
			position: relative;
		}
		
		.loginmodal-container input[type=text], input[type=password]{
			width: 100%;
			height: 44px;
			padding: 0 8px;
			margin-bottom: 10px;
			border: 1px solid #d9d9d9;
			border-top: 1px solid #c0c0c0;
			-webkit-appearance: none;
			box-sizing: border-box;
			-mox-box-sizing: border-box;
			background: #fff;
		}
		
		.loginmodal-container input[type=text]:hover, input[type=password]:hover{
			border: 1px solid #b9b9b9;
			border-top: 1px solid #a0a0a0;
			box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
			-moz-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
			-webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
		}
		
		.loginmodal-submit{
			padding: 17px 0px;
			border: 0px;
			text-shadow: 0 1px rgba(0, 0, 0, 0.1);
			color: #fff;
			background-color: #EB4646;
			font-size: 14px;
			font-family: roboto;
		}
		
		.loginmodal-submit:hover{
			border: 0px;
			background-color: #EB0000;
			text-shadow: 0 1px rgba(0, 0, 0, 0.3);
		}
		
		.loginmodal-help{
			font-size: 12px;
		}
		
		.dropdown:hover .dropdown-menu{
			disply: block;
		}	
		
		.signupmodal-container{
			width: 100% !important;
			max-width: 350px;
			padding: 30px;
			margin: 0 auto;
			background-color: #F7F7F7;
			border-radius: 2px;
			box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
			overflow: hidden;
			font-family: roboto;
		}
		
		.signupmodal-submit{
			padding: 17px 0px;
			border: 0px;
			text-shadow: 0 1px rgba(0, 0, 0, 0.1);
			color: #fff;
			background-color: #EB4646;
			font-size: 14px;
			font-family: roboto;
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
	
	
	<!-- Modal -->
	<!-- Sign up modal -->
	<div class="modal fade" id="SignUp-modal" tabindex="-1" role="dialog" 
	     aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
		<div class="modal-dialog">
			<div class="signupmodal-container">
				<h1>Registration</h1>
				<br>
				<c:url var="addUrl" value="doLogin"/>
				<form action="${addUrl}" method="GET">
					<input type="text" name="companyname" placeholder="Company Name">	
					<input type="text" name="email" placeholder="Email">
					<input type="password" name="password" placeholder="Password">
					<input type="password" name="confirmpassword" placeholder="Confirm Passrword">			
					<input type="submit" name="signup" class="signup signupmodal-submit" value="Registration">
				</form>
			</div>
		</div>
	</div>
			
	<!-- Login modal -->
	<div class="modal-fade" id="login-modal" tabindex="-1" rold="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
		<div class="modal-dialog">		
			<div class="loginmodal-container">
				<h1>Login to Your Account</h1>
				<br>
				<c:url var="addUrl" value="doLogin"/>
				<form>
					<input type="text" name="email" placeholder="Email">
					<input type="password" name="password" placeholder="Password">
					<input type="submit" name="login" class="login loginmodal-submit" value="Login">
				</form>
			</div>
		</div>
	</div>
</head>
<body>
</body>
</html>