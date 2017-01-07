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
<script>

</script>
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

.checkbox-align
{
   position:absolute;
   top:300px;
   right:0;
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
</head>
<body>
<body>
<div class="panel panel-default" id = "panel1">
  <div class="panel-body" >
  <div class ="col-xs-8 text-right">
   <a href="teachers.htm" class="droid" data-cname="teacher_product"><b><i>for</i></b><span class="color"> Teachers</span></a>
 <div class = "col-xs-11 text-right">
  <a href = "students.htm" class = "droid" data-cname="student_product"><b><i>for</i></b><span class="color"> Students</span></a>
  </div>
  </div>
   
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
  <div class="panel panel-default">
		<div class="panel-body">
		<div class="col-xs-12 text-right">
<a href ="login.htm" class="btn btn-primary btn-sm">Logout</a>
			<div class="col-xs-10 text-left">
				<p class = "heading">Welcome to Global Education Portal</p>
			</div>
			</div>
			</div>
			</div>
			<div class="container">
      <nav class="navbar navbar-default" role="navigation">
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav">
            <li><a href="#"><b>Update Profile</b></a></li>
            <li><a href="#"><b>Profile</b></a></li>
          <li><a href="Batches.htm?faculty=${sessionScope.facultyId}"><b>Batches</b></a></li>
          </ul>
        </div>
      </nav>
      </div>
<h3 align = "center"  style="color:red;"> You can select maximum 3 subjects from any of the courses</h3> 
			   <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="Courses.htm?course=Business">Business</a><br/><br/>
                </li>
                <li>
                    <a href="Courses.htm?course=Arts and Humanities">Arts and Humanities</a><br/><br/>
                </li>
                <li>
                    <a href="Courses.htm?course=Computer Science">Computer Science</a><br/><br/>
                </li>
                <li>
                    <a href="Courses.htm?course=Data Science">Data Science</a><br/><br/>
                </li>
                
               
            </ul>
        </div>
        </div>
        <div class = "checkbox-align" style="float:right; width:75%; ">
        <form action = "addBusinessCourses.htm" method = "post">
         <label class="checkbox">
            <input type="checkbox" class = "lessons" value="Basics of Programming" name="inlineCheckbox1"> Basics of Programming
                    </label><br/>
         <label class="checkbox">
            <input type="checkbox" class = "lessons" value="Data Structure and Algorithms" name="inlineCheckbox2">Data Structure and Algorithms
            </label><br/>
         <label class="checkbox">
            <input type="checkbox" class = "lessons" value="Operating Systems" name="inlineCheckbox3"> Operating Systems
            </label> <br/>
          <label class="checkbox">
            <input type="checkbox" class = "lessons" value="Compiler Design" name="inlineCheckbox4"> Compiler Design
             </label> <br/>
        <label class="checkbox">
            <input type="checkbox" class = "lessons" value="Artificial Intelligence" name="inlineCheckbox5"> Artificial Intelligence
               </label> <br/>
        <input type = "submit" name= "addCourse" id="btnSubmit">
        <input type = "hidden" name="courseName" value="Computer Science">
        </form>
                </div>
</body>
</html>
