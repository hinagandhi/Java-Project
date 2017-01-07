<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<html>
<head>
<link rel='stylesheet'
	href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
	  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
       </script> 
 <script
	src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>
	<script>
	  $(document).ready(function () 
              {
                 
       $('.btn1').click(function(event){
           event.preventDefault();
            var home = $(this).closest("tr");
            var index =  $(this).closest('td').parent()[0].sectionRowIndex;
            var courseduration =  home.find("input[name='duration"+(index)+"']").val();
            var courseLevel = home.find("input[name='level"+(index)+"']").val();
            var subjects = home.find("input[name='subjectName"+(index)+"']").val();
            var arr =
            {  subjects: subjects,
               courseduration: courseduration ,
               courseLevel: courseLevel};
      
       $.ajax({
           type: "GET",
           dataType: "json",
           contentType: "application/json",
           url: "addBusinessCourses.htm?check=saverow",
           data: arr,
           success: function (data) { 
        	   if(data.messages.equalsIgnoreCase("you can enter only high or low "))
        		   alert("Please enter high or low");
    }});  

       home.find("input[name='duration"+(index)+"']").prop("disabled", true);
      home.find("input[name='level"+(index)+"']").prop("disabled", true);
              });
              });
	</script>
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
#section {
    width:350px;
    float:left;
    padding:10px;	 	 
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
          
            <li><a href="facultySignUpEdu.htm?var=view&facId=${faculty.facultyId}"><b>Profile</b></a></li>
          <li><a href="Batches.htm?faculty=${faculty.facultyId}"><b>Batches</b></a></li>
          </ul>
        </div>
      </nav>
      </div>
<h3 align = "center"  style="color:red;" > You can select maximum 3 courses you want to teach </h3> 
			   <div id="wrapper">
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                   
                    <a href="Courses.htm?course=Business">Business</a><br/><br/>
                </li>
                <li>
                    <a href="Courses.htm?course=Computer Science">Computer Science</a><br/><br/>
                </li>
                <li>
                    <a href="Courses.htm?course=Data Science">Data Science</a><br/><br/>
                </li>
                <li>
                    <a href="Courses.htm?course=Arts and Humanities">Arts and Humanities</a><br/><br/>
                </li>
            </ul>
        </div>
</div>
<div id="section" style= "float:right; width:75%;">
<c:choose>

<c:when test="${! empty subjects}">
        <table id = "table" border="1">
        <tr><th>Subject Name</th>
        <th>Course Duration(months)</th>
        <th>Course Level(high/low)</th>
        <th>Save</th>
        <c:forEach var = "subjects" items="${subjects}">
          <c:set var="val" value="${val + 1}" />
                <c:set var= "val1" value= "${val}"/>
        <tr><td><input type="text" name= "subjectName${val}" value= "${subjects.subjectName}" class="field left" readonly ></td>
        <td><input type="number" name="duration${val}" min="1" max="12"/></td>
        <td><input type= "text" name="level${val}"/></td>
        <td><button id ="save" class ="btn1">Save</button></td>
       </tr>
       </c:forEach>
       </table>
       </c:when>
       
       <c:when test ="${!empty subList}">
        <table id = "table" border="1">
        <tr><th>Subject Name</th>
        <th>Course Duration(months)</th>
        <th>Course Level(high/low)</th>
        <th>Save</th>
        <c:forEach var = "subjects" items="${subList}">
          <c:set var="val" value="${val + 1}" />
                <c:set var= "val1" value= "${val}"/>
        <tr><td><input type="text" name= "subjectName${val}" value= "${subjects.subjectName}" class="field left" readonly ></td>
        <c:if test = "${ subjects.courseDuration == 0}">
        <td><input type="number" name="duration${val}" max="12" min="1"/></td>
        </c:if>
         <c:if test = "${ subjects.courseDuration != 0}">
        <td>${subjects.courseDuration}</td>
        </c:if>
        <c:if test = "${ empty subjects.levelType}">
        <td><input type= "text" name="level${val}"/></td>
        </c:if>
         <c:if test = "${ !empty subjects.levelType}">
          <td>${subjects.levelType}</td>
         </c:if>
        <td><button id ="save" class ="btn1">Save</button></td>
       </tr>
       </c:forEach>
       </table>
       </c:when>
       <c:when test= "${empty subjects}">
       <h4>You have to select the courses that you want to teach</h4>
       <table id = "table" border="1">
        <tr><th>Subject Name</th>
        <th>Course Duration(months)</th>
        <th>Course Level</th>
        <th>Save</th>
        <th>Delete</th></tr>
        </table>
       </c:when>
       </c:choose>
       <br/><br/>
</div>
</body>
</html>