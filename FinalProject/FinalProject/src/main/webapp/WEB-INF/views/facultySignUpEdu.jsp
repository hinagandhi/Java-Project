 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<html>
<head>
<link rel='stylesheet'
	href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script> 
 <script
	src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
 </script>
<title>Home</title>

<script>
var i=1;
var j=1;
var k=1;
$(document).ready(function() {
    
    $("input[name$=group1]").change(function() {
        var test = $(this).val();
        $(".desc").hide();
        $("#" + test).show();
    });
    $("input[name$=group1]:checked").change();
});
$(document).ready(function() {
    
    $("input[name$=group1]").change(function() {
        var test = $(this).val();
        $(".descr").hide();
        $("#" + test).show();
    });
    $("input[name$=group1]:checked").change();
});
$(document).ready(function() {
$("input[name$=group2]").change(function() {
    var test1 = $(this).val();
    $(".desc1").hide();
    $("#" + test1).show();
});
$("input[name$=group2]:checked").change();
});
$(document).ready(function() {
    
    $("input[name$=group3]").change(function() {
        var test = $(this).val();
        $(".desc2").hide();
        $("#" + test).show();
    });
    $("input[name$=group3]:checked").change();
});
$(document).ready(function() {
	$(function(){
		$( '#Yes' ).on( 'click', 'a', function () {
			  var max_fields = 10;
			  if(this.text == "Add more Teaching Experience")
		            {i++;
		            $(this).closest("div").append('<div id = "Yes"><input type="text" name="institutionName'+i+'" placeholder ="Instituition Name" /><br/><br/><input type="text" name="teachingPosition'+i+'" placeholder ="Teaching Position" /><br/><br/><a class = "teach_add" href="addingTeachExp">Add more Teaching Experience</a>&nbsp;|&nbsp;<a href="#">Remove Teaching Experience </a></div>');
		           var arr = {count: i};
		            $.ajax({
		                type: "GET",
		                dataType: "json",
		                contentType: "application/json",
		                url: "facultySignUpEdu.htm?check=updatei&count="+i+"",
		                data: arr,
		                success: function (data) { 
		            }});
		           
		            }
			  else
				  {
				  $(this).closest("div").remove();
				  i--;
				  var arr = {count: i};
				  $.ajax({
		                type: "GET",
		                dataType: "json",
		                contentType: "application/json",
		                url: "facultySignUpEdu.htm?check=updatei&count="+i+"",
		                data: arr,
		                success: function (data) { 
		            }});
				  }
			  return false;
		    });
		});
});
$(document).ready(function() {
	$(function(){
		$( '#RYes' ).on( 'click', 'a', function () {
			  if(this.text == "Add more Research Work")
		            {j++;
		            $(this).closest("div").append('<div id = "RYes"><input type="text" name="field'+j+'" placeholder ="Research Field" /><br/><br/><input type="text" name="publications'+j+'" placeholder ="Publications" /><br/><br/><a class = "research_add" href="addingResearchExp">Add more Research Work</a>&nbsp;|&nbsp;<a href="#">Remove Research Work</a>');
		           var arr = {countR: j};
		            $.ajax({
		            	
		                type: "GET",
		                dataType: "json",
		                contentType: "application/json",
		                url: "facultySignUpEdu.htm?check=updatei&countR="+j+"",
		                data: arr,
		                success: function (data) { 
		            }
		            });
		           
		            }
			  else
				  {
				  $(this).closest("div").remove();
				  j--;
				  var arr = {countR: j};
				  $.ajax({
		                type: "GET",
		                dataType: "json",
		                contentType: "application/json",
		                url: "facultySignUpEdu.htm?check=updatei&countR="+j+"",
		                data: arr,
		                success: function (data) { 
		            }});
				  }
			  return false;
		    });
		});
});
$(document).ready(function() {
	$(function(){
		$( '#IYes' ).on( 'click', 'a', function () {
			  if(this.text == "Add more Industrial Work")
		            {k++;
		            $(this).closest("div").append('<div id = "IYes"><input type="text" name="industryName'+k+'" placeholder ="Industry Name" /><br/><br/><input type="text" name="position'+k+'" placeholder ="Position"/><br/><br/><input type = "number" name="yearsOfWorkExperience'+k+'"  min="0" step="1" placeholder="Years Of Experience"/><br/><br/><a class = "industrial_add" href="addingIndustrialExp">Add more Industrial Work</a>&nbsp;|&nbsp;<a href="#">Remove Industrial Work</a>');
		           var arr = {countI: k};
		            $.ajax({
		                type: "GET",
		                dataType: "json",
		                contentType: "application/json",
		                url: "facultySignUpEdu.htm?check=updatei&countI="+k+"",
		                data: arr,
		                success: function (data) { 
		            }});
		           
		            }
			  else
				  {
				  $(this).closest("div").remove();
				  k--;
				  var arr = {countI: k};
				  $.ajax({
		                type: "GET",
		                dataType: "json",
		                contentType: "application/json",
		                url: "facultySignUpEdu.htm?check=updatei&countI="+k+"",
		                data: arr,
		                success: function (data) { 
		            }});
				  }
			  return false;
		    });
		});
});

</script>
<style type="text/css">
#panel1 {
	background-color: 206880;
	margin-bottom: 0px;
}
.heading{
top:30px;
text-align: center;
	text-indent: 50px;
	font-size: 200%;
}
.content
{
    display: none;
}
#radio1{
 width:20px;
    height:20px;
}
.color{
color:#FFFFFF;
}
.text2{
 margin: 0 auto;
    width:80% ;
}
.formStudent{
position: absolute;
	top: 18%;
	left: 35%;
	font-size:20px;
}
.btn-primary {
	width: 6em;
	height: 3em;
	font-size: 14px;
}
#para1{
font-size : 20px;
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
<div class="panel panel-default" id = "panel1">
  <div class="panel-body" >
  <div class ="col-xs-8 text-right">
   <a href="teachers.htm" class="droid" data-cname="teacher_product"><b><i>for</i></b><span class="color"> Teachers</span></a>
 <div class = "col-xs-11 text-right">
  <a href = "students.htm" class = "droid" data-cname="student_product"><b><i>for</i></b><span class="color"> Students</span></a>
  </div>
  </div>
     </div>
  </div>
	<div class="panel panel-default">
		<div class="panel-body">
		<div class="col-xs-12 text-right">
<a href ="login.htm" class="btn btn-primary btn-sm">Logout</a>
			<div class="col-xs-10 text-left">
				<p class = "heading">Welcome to Global Education Portal,&nbsp;&nbsp;${username}</p>
			</div>
			</div>
			</div>
			</div>
		<div class = "formStudent">
		<form action="facultySignUpEdu.htm"  method="post" enctype="multipart/form-data">
		<p><b><font color = "red">Enter your details to activate your account</font></b></p><br/>
		<p>Education details :</p>
		<input type = "text" name="firsthighestdegree" placeholder="Highest Degree" ><br/><br/>
		<input type = "text" name="highestmajor" placeholder="Highest Major" ><br/><br/>
		<input type = "text" name="universityname" placeholder="University Name" ><br/><br/>
		<input type="text" name="place1" placeholder ="Country" ><br/><br/>
		<input type ="text" name="secondhighestdegree" placeholder="Second Highest Degree"/><br/><br/>
		<input type = "text" name="secondhighestmajor" placeholder="Second Highest Major" ><br/><br/>
		<input type = "text" name="universityname2" placeholder="University Name"/><br/><br/>
		<input type="text" name="place2" placeholder ="Country" ><br/><br/>
		Do You have teaching experience?&nbsp;
    <input type="radio" name="group1" value="Yes"  />
    Yes
    <input type="radio" name="group1" value="No" checked="checked" />
    No
    <br/><br/>
    <div id = "Yes" class = "desc">
    <input type="text" name="institutionName1" placeholder ="Instituition Name" /><br/><br/>
    <input type="text" name="teachingPosition1" placeholder ="Teaching Position" /><br/><br/>
   <a class = "teach_add" href="addingTeachExp">Add more Teaching Experience</a>&nbsp;|&nbsp;<a href="#">Remove Teaching Experience </a>
    </div>
    	Do You have research experience?&nbsp;
    <input type="radio" name="group2" value="RYes"  />

    Yes
    <input type="radio" name="group2" value="RNo" checked="checked" />
    No
    <br/><br/>
    <div id = "RYes" class = "desc1">
    <input type="text" name="field1" placeholder ="Research Field" /><br/><br/>
    <input type="text" name="publications1" placeholder ="Publications" />
    <br/><br/>
   <a class = "research_add" href="addingResearchExp">Add more Research Work</a>&nbsp;|&nbsp;<a href="#">Remove Research Work</a>
    </div>
    Do You have industrial experience?&nbsp;
    <input type="radio" name="group3" value="IYes"  />
    Yes
    <input type="radio" name="group3" value="INo" checked="checked" />
    No
    <br/><br/>
    <div id = "IYes" class = "desc2">
    <input type="text" name="industryName1" placeholder ="Industry Name" /><br/><br/>
    <input type="text" name="position1" placeholder ="Position" /><br/><br/>
    <input type = "number" name="yearsOfWorkExperience1"  min="0" step="1" placeholder="Years Of Experience"/> 
    <br/><br/>
    <a class = "industrial_add" href="addingIndustrialExp">Add more Industrial Work</a>&nbsp;|&nbsp;<a href="#">Remove Industrial Work</a> 
    </div>
    Select image to upload :<input type = "file" name = "uploadImage"><br/>
    <button type="submit" class="btn btn-primary" id = "btn1">Submit</button>
    <input type = "hidden" name = "registeredUser" value = "checked"/>
     	</form>
     	</div>
</body>
</html>
