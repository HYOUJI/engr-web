<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<!--홈  -->
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
		integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
		crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
		integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
		crossorigin="anonymous">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js" />

	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
		crossorigin="anonymous"/>

	<link 
		href="https://fonts.googleapis.com/css?family=Anton"
		rel="stylesheet" type="text/css">
	<link
		href="https://fonts.googleapis.com/css?family=Roboto+Condensed:700"
		rel="stylesheet" type="text/css">

	<title>Home</title>

	<link href="https://fonts.googleapis.com/css?family=Francois+One" rel="stylesheet" type="text/css">
</head>

<body>
	<!---------------------------------네비게이션 바 -------------------------  -->
	<jsp:include page="topNavigation.jsp" flush="false"></jsp:include>

	<!-- DEFINE STYLE -->
	<style>
		@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);

		#title {
			background-color: #880000;
			padding-top: 60px;
			padding-bottom: 30px;
			color: black;
			font-size: 60px;
		}

		#titlep {
			font-size: 20px;
		}

		.bootstrap-demo {
			padding: 50px;
		}
	</style>
	
<!-- 네비게이터 아래, 타이틀 부분 -->
<!-- 이클립스 css 파일	-->
		<h1 id="title" align="center" style="font-family: 'Anton', sans-serif; color: #FFFFFF;"> ZEBRA<br>
		<p id="titlep" class="lead" style="font-family: 'Anton', sans-serif;">
			Section of the community to build healthy consumption culture
		</p>
	</h1>

	<!-- 이미지 자동으로 넘어가는 부분 -->
	<div class="container" style="padding-top: 40px">
		<!-----------------------쿠르셜 시작  ---------------------------->
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>
				<li data-target="#carousel-example-generic" data-slide-to="2"></li>
			</ol>
			
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox"
				style="width: 1158; height: 444">

				<div class="item active">
					<img src="/engrZebra/resources/image/cru-1.png">
					<div class="carousel-caption">
						<h1 style="color: #FFFFFF; text-shadow: 3px 3px #3c3c3c">Scan a barcode!</h1>
						<p style="color: #FFFFFF; text-shadow: 1px 1px #3c3c3c">Find the barcode of the item you want.</p>
					</div>
				</div>

				<div class="item">
					<img src="/engrZebra/resources/image/cru-2.png" title="cold" alt="...">
					<div class="carousel-caption">
						<h1 style="color: #FFFFFF; text-shadow: 3px 3px #3c3c3c">Scan a barcode!</h1>
						<p style="color: #FFFFFF; text-shadow: 1px 1px #3c3c3c">Find the barcode of the item you want.</p>
					</div>
				</div>

				<div class="item">
					<img align="middle" src="/engrZebra/resources/image/cru-3.png">
					<div class="carousel-caption">
						<h1 style="color: #FFFFFF">It is come from saying 'no' to
							1,000 things </h1>
						<p class="lead" style="color: #FFFFFF">
							I think if you do
							something and it turns out pretty good, then you should go do
							something else wonderful, not dwell on it for too long.
						</p>
					</div>
				</div>

			</div>

			<!-- Controls -->
			<a class="left carousel-control" 
				href="#carousel-example-generic"
				role="button" data-slide="prev"> 
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> 
			
			<a class="right carousel-control" 
				href="#carousel-example-generic"
				role="button" data-slide="next"> 
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>

		<script type="text/javascript">
			$('.carousel').carousel({
				interval : 2000
			})
		</script>
		<!------------------------------------------------------쿠르셜 끝---------->
	</div>

	<h1 align="center" style="font-family: 'Roboto Condensed', sans-serif; padding: 40px">ZEBRA Service</h1>
	<img
		src="https://scontent.xx.fbcdn.net/t31.0-8/13247920_172959903102102_2284409825658967265_o.jpg"
		alt="china thumbnail">

	<img alt="" src="/engrZebra/resources/image/mainimg1.png" style="padding-top: 40px; padding-bottom: 100px">

	<!-- Footer -->
	<div class="container">
		<hr>
			<h1 align="center" style="font-family: 'Roboto Condensed', sans-serif; padding: 40px"> Engineering Competition Project </h1>
		<p style="font-family: 'Francois One', sans-serif;" align="center">
		    It is our engineering competition project, Project members consist of
			limky,iguru,bang, yoonmin, youji<br/>
			 Vision The purpose of our service is largely
			divided into two depending on the position.
			For the consumer while
			receiving provide a practical product review service assist in
			efficient purchase selection . For businesses to readily identify the
			consumer index , allows the strategic sales management .
			 In addition,the ultimate purpose of our service is to make a place for the
			community to build healthy consumption culture among consumers and
			businesses.
		</p>

		<footer>
			<div class="row" style="padding-top: 150px">
				<div class="col-lg-12">
					<p>Copyright &copy; Your Website 2016</p>
				</div>
			</div>
			<!-- /.row -->
		</footer>
	</div>


</body>
</html>
