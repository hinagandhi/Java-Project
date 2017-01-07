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
  text-align:center;
  }
 ul.nav {
    display: inline-block;
    
}
.nav-tabs li a {
	font-size: 30px;
	text-indent: 50px;
}
</style>
<script>
    
</script>

</head>
<body>
 
	<h4 align = "center"><b>View Students of Batch</b></h4>
		 <table  align = "center" style="width: 900px;" id ="table" border="1">
		   <tr>
                <th>BatchId</th>
                <th>Subject Name</th>
                <th>Student Id</th>
                <th>Student Name</th>
                
                <c:forEach var="batches" items = "${batches}">
                <c:set var="val" value="${val + 1}" />
          <tr>
          <td>
          <input type="text" name="batchId${val}" value ="${batches[0].batchId}" readonly/></td>
          <td><input type="text" name="subjectName${val}" value="${batches[0].subjectName}" readonly/></td>
          <td><input type="text" name="studentId${val}" value="${batches[1].studentId}" readonly/></td>
          <td><input type="text" name="studentName${val}" value="${batches[1].firstName}&nbsp; ${batches[1].lastName}" readonly/></td>
         
          </tr>   
          </c:forEach> 
		 </table>
		
</body>
</html>
