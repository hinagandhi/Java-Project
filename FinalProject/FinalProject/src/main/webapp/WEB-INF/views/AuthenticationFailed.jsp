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
.color{
color:#FFFFFF;
}
.text2{
 margin: 0 auto;
    width:80% ;
}
.btn-primary{
width: 6em;  height: 3em;
font-size:14px;
}
#backgroudImg{
background-image: url("http://slworkshop.net/wp-content/uploads/2015/01/lifelong-learning.jpg");
}
	</style>
</head>
<body>
<div class="panel panel-default" id = "panel1">
  <div class="panel-body" >
  <div class ="col-xs-8 text-right">
   <a href="teachers.htm" class="droid" data-cname="teacher_product"><b><i>for</i></b><span class="color"> Teachers</span></a>
 <div class = "col-xs-11 text-right">
  <a href = "students.htm" class = "droid" data-cname="student_product"><b><i>for</i></b><span class="color"> Students</span></a>
 <div class = "col-xs-6 text-left">
 <a href = "home.htm"><img src= "http://www.contramare.net/site/wp-content/uploads/2015/10/FLlogo.jpg"  class="img-responsive center-block" style = "width:100px;height:50px"/></a>
 </div>
  </div>
  </div>
     </div>
  </div>
<div class="panel panel-default">
<div class="panel-body" >
 <div class="col-xs-12 text-right">
<a href = "signUp.htm" class="btn btn-primary btn-sm">Sign Up</a>
<div class="col-xs-11">
<a href ="login.htm" class="btn btn-primary btn-sm">Login</a>
<div class="col-lg-3" >
<form role="search" method="get" action="#">
    <div class="input-group">
      <input id= "text2" type="text" name="criteria" class="form-control" maxlength="6" placeholder="Search for courses & lessons">
      <div class="input-group-btn">
        <button class="btn btn-primary"><i class="glyphicon glyphicon-search"></i></button>              
        </div>
        </div>
        </form>
        </div>     
</div>
</div>
</div>
</div>
<div >
<c:choose>
<c:when test="${alreadyexists == 'true'}">
<h3>The username already exists!!! Try another email id</h3>
</c:when>
<c:when test="${empty alreadyexists}">
<h3>Authentication Failed!!! Try Again</h3>
</c:when>
</c:choose>
        </div> 
</body>
</html>

