<%@page contentType= "text/html; charset=UTF-8" %>

<%
//リクエストスコープからのデータの取得
String answer = (String)request.getAttribute("answer");
%>

<html>
	<head>
		<title>足し算</title>
	</head>
	<body>
		<form action="/java_basic/UseForm" method="get">
		<input type="text" name= "number1">+
		<input type="text" name= "number2">
		= <%= answer %><br>
		<button>送信</button>
		<button type="reset">リセット</button>
		</form>
	</body>
</html>