<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>

<!DOCTYPE>
<html>
<head>
	<meta charset="utf-8">
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

	<!------- library ------->
	<!-- style -->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>

	<!-- optional theme -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"/>
	
	<!-- font -->	
	<link rel="stylesheet" 	type="text/css" 
		href="http://fonts.googleapis.com/css?family=Anton" />
	<link rel="stylesheet" type="text/css"
		href="https://fonts.googleapis.com/css?family=Roboto+Condensed:700"/>	
	<link rel="stylesheet" type="text/css"
		href="https://fonts.googleapis.com/css?family=Francois+One"/>
			
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		
	<title>Home</title>
	
</head>

<body>
	
	<!-- style -->
	<style>
		@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
		
		#title{
			background-color: #880000;
			padding-top: 60px;
			padding-bottom: 30px;
			color: black;
			font-size: 60px;
		}	
		
		#title_P_Tag{
			font-size: 20px;
		}
	</style>
	
	<!-- Navigation Bar -->
	<jsp:include page="topNavigator.jsp" flush="false"></jsp:include>
	
	<!-- Home -->
	<h1 id="title" align="center" style="font-family: 'Anton', sans-serif; color: #FFFFFF;"> ZEBRA<br>
		<p id="title_P_Tag" class="lead" style="font-family: 'Anton', sans-serif">
			Section of the community to build healthy consumption culture
		</p>	
	</h1>
	
	<!-- Start 쿠르셜 -->
	<div class="container" style="padding-top: 40px;">
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		
			<!-- Indicators -->
		
		
			<!-- Wrapper for Image slides -->
			
			
		</div>
		
		<!-- Controls -->
		
	</div>
	<!-- End 쿠르셜 -->

	<h1 align="center" style="font-family: 'Roboto Condensed', sans-serif; padding: 40px;">ZEBRA Service</h1>
	<img
		src="https://scontent.xx.fbcdn.net/t31.0-8/13247920_172959903102102_2284409825658967265_o.jpg"
		alt="china thumbnail">
	<!-- 이미지 추가 -->
	<!-- <img
		src=""
		alt="" > -->
		
	<!-- Footer -->

</body>

</html>
