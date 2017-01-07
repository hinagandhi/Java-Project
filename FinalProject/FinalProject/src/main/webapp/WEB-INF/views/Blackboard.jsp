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
$(document).ready(function () 
        {
$('.btn').click(function(event){
    event.preventDefault();
var home = $(this).closest("tr"); 
var index =  $(this).closest('td').parent()[0].sectionRowIndex;
var subjectname = home.find("input[name='subjectName"+(index)+"']").val();
var facultyID = home.find("input[name='facultyId"+(index)+"']").val();
var studentId = ${sessionScope.student.studentId};
var arr = {subjectname: subjectname,
		   facultyID: facultyID,
		   studentId:studentId};
$.ajax({
    type: "GET",
    dataType: "json",
    contentType: "application/json",
    url: "courseRegister.htm",
    data: arr,
    success: function (data) { 
    	if(data.messages.equalsIgnoreCase("you are already registered"))
    		{
    		
    		}
    	else
    		{
    		home.find('button[id=\'btn\']').attr('disabled', true);
        	home.find('button[id=\'btn\']').html('Registered');
    		}
    },
    complete: function(data){
    	var values = [];
        values = data;
        
   	
    }
});


   });
        });  
        
</script>

</head>
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
<a href ="login.htm" class="btn1 btn-primary btn-sm">Logout</a>
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
          <li><a href="homePage.htm?email=${sessionScope.student.studentId}"><b>Home</b></a></li>
          <li><a href="blackboard.htm?stud=${sessionScope.student.studentId}"><b>Blackboard</b></a></li>
          </ul>
        </div>
      </nav>
     
   </div>
	<div>
	<h4 align = "center"><b>Courses you are enrolled in</b></h4>
		 <table  align = "center" style="width: 900px;" id ="table" border="1">
		   <tr>
                <th>BatchId</th>
                <th>Faculty Teaching</th>
                <th>Subject Name</th>
                <th>Schedule</th>
              </tr>
                <c:forEach var="batches" items = "${batchesStud}">
                <c:set var="val" value="${val + 1}" />
          <tr>
        <td><input type="text" name="batchId${val}" value ="${batches[0].batchId}" readonly/></td>
<td><input type="text" name="facultyName${val}" value="${batches[0].getFaculty().firstName}&nbsp;${batches[0].getFaculty().lastName}" readonly/></td>
          <td><input type="text" name="subjectName${val}" value="${batches[0].subjectName}" readonly/></td>
          <td><a href="MaterialsView.htm?var=${batches[0].batchId}" target="_blank">View Materials</a></td>   
          
          </tr>   
          </c:forEach>   
		 </table>
	</div>	
</body>
</html>
