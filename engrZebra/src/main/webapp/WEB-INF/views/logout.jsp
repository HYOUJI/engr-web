<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>

	<%
		String nowID = (String)session.getAttribute("loginUser");

		session.removeAttribute("loginUser");
		session.removeAttribute("sessionLoginMember");
		
		session.invalidate();	

		String msg = null;
		msg = nowID + "님 안녕히 가세요";
	%>
	
	<script type="text/javascript">
		alert("<%= msg %>");
		location.href="/engrZebra";
	</script>

</body>
</html>