<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<html>
<head>
<link rel='stylesheet'
	href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script> 
 <script
	src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>
<title>Home</title>
<style type="text/css">
#panel1 {
	background-color: 206880;
	margin-bottom: 0px;
}
.page-body{
position: absolute;
	top: 25%;
	left: 35%;
	font-size:20px;
}
.content
{
    display: none;
}
#radio1{
 width:20px;
    height:20px;
}
.formStudent{
position: absolute;
	top: 30%;
	left: 35%;
	font-size:20px;
}
.btn-primary {
	width: 6em;
	height: 3em;
	font-size: 14px;
}
.color{
color:#FFFFFF;
}
.text2{
 margin: 0 auto;
    width:80% ;
}

#text1 {
	text-align: center;
	text-indent: 50px;
	font-size: 200%;
}

.nav-tabs li a {
	font-size: 26px;
	text-indent: 50px;
}

.nav-center {  
  text-align:center;
  }
 ul.nav {
    display: inline-block;
    
}
</style>
</head>
<body>
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
<div class ="col-xs-7 text-right">
<h3><b>Enter your credentials</b></h3>
</div>
</div>
</div>
</div>
	<div class = "page-body">
		<form action="login.htm"  method="post">
    <input type= "email" name = "emailId" placeholder="Email ID" required><br/><br/>
     <input type= "password" name = "password" placeholder="Create Password" required><br/><br/>
    <input type = "submit"  name="Submit" value ="Login" ><br/><br/>
    <input type = "hidden" name = "registeredUser" value="checked">
     	</form>
	</div>
</body>
</html>
