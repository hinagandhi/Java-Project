<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page session="false" %>
<html>
<head>
 <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>  
        <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>
	<title>Home</title>
	<style type = "text/css">
	#panel1 {
  background-color: 206880;
  margin-bottom: 0px;
}
.btn-primary{
width: 6em;  height: 3em;
font-size:14px;
}
	</style>
</head>
<body>
<div class="panel panel-default" id = "panel1">
  <div class="panel-body"></div>
  </div>
<div class="panel panel-default">
<div class="panel-body" >
 <div class="inline-block login-signup">
<a href = "signUp.htm" class="btn btn-primary btn-sm">Sign Up</a>
</div>
</div>
</div>
</body>
</html>

