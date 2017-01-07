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
.heading{
top:30px;
text-align: center;
	text-indent: 50px;
	font-size: 200%;
}
.navbar .navbar-nav {
  display: inline-block;
  float: none;
  vertical-align: top;
}

.navbar .navbar-collapse {
  text-align: center;
}
.content
{
    display: none;
}
#radio1{
 width:20px;
    height:20px;
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
.wrapper .square {
-moz-border-radius:6px 6px 6px 6px;
border:1px solid silver;
float:left;
margin:10px;
min-height:200px;
width:200px;
}
#text1 {
	text-align: center;
	text-indent: 50px;
	font-size: 200%;
}
.navbar .navbar-nav {
    display: inline-block;
    float: none;
}

.navbar .navbar-collapse {
    text-align: center;
    top:-44px;
}
.body{
top:30px;
text-align: center;
	text-indent: 50px;
	font-size: 150%;
}
.nav-center { 
   width: 100%;
    float: left;
    margin: 0 0 1em 0;
    padding: 0;
    border-bottom: 1px solid #4c4c4c;
    position:absolute;
    bottom:400;
  }
 ul.nav {
    display: inline-block;
    
}
.nav-tabs li a {
	font-size: 30px;
	text-indent: 50px;
}
</style>
</head>
<body>
<body>
  <div class="panel panel-default" id = "panel1">
  <div class="panel-body" >
  </div>
  </div>  
     <div class= "wrapper">
<div class="square">
    <img src="https://upload.wikimedia.org/wikipedia/commons/8/85/Selena_Gomez_-_Walmart_Soundcheck_Concert.jpg" style = "width:200px;height:200px">
</div>
</div>
<div class ="square" id = "square2">
Professor<br/>
 <c:set var="var1" value = "${faculty}"/>
<b><span class ="heading">${var1.firstName} , ${var1.lastName}</span></b>
<br/>
Email address<br/>
<b><span class = "body">${var1.email}</span></b> 
</div>  
  <div class = "nav-center">
		<ul class="nav nav-tabs">
			<li class="active"><a href="#education" data-toggle="tab">
					Education</a></li>
			<li><a href="#research" data-toggle="tab">Research</a></li>
			<li><a href="#industrial"data-toggle="tab">Industrial</a></li>
		</ul><br/>
		<div class="tab-content">
			<div class="tab-pane active" id="education">
			<b>Education Details</b>
		    <c:forEach var="eduList" items = "${education}">	
			<p><span><b>> &nbsp;</b></span> Holding Degree in <b> ${eduList.degree}</b> majoring in <b>${eduList.majors}</b> from <b>${eduList.college}</b> in <b>${eduList.country}</b><br/> </p>
			</c:forEach>
			</div>
			<div class="tab-pane" id="research">
			<b>Research Details</b>
		    <c:forEach var="resList" items = "${researchList}">	
			<p><span><b>&nbsp;</b></span>Has done research work in <b>${resList.reserachArea}</b> and has written publication namely <b>${resList.publication}</b><br/> </p>
			</c:forEach>
     	</div>
     	<div class="tab-pane" id="industrial">
     	<b>Industrial Details</b>
		    <c:forEach var="indusList" items = "${indusList}">	
			<p><span><b>> &nbsp;</b></span>Has industrial experience in company&nbsp;<b>${indusList.industryName}</b> at position <b>${indusList.position} </b>and have
			<b>${indusList.yearsOfExperience}</b> &nbsp; years of experience in this company<br/> </p>
			</c:forEach>
     	</div>
		</div>
			</div>
			
</body>
</html>
