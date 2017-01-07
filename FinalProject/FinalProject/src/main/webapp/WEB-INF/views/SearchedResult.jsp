<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page session="false" %>
<html>
<head>
<link rel='stylesheet'
	href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script> 
 <script
	src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>
	<title>Home</title>
	<script>
	$(document).ready(function () 
	        {
	$("input[type='checkbox']").change(function() {
	    if(this.checked) {
	    	var thisCheck = $(this).val();
	    	var x=$(this);
	    	var arr= {
	    			thisCheck:thisCheck
	    	};
	    	$.ajax({
	    	    type: "GET",
	    	    dataType: "json",
	    	    contentType: "application/json",
	    	    url: "search.htm?criteria1=find",
	    	    data: arr,
	    	    success: function (data) { 
	    	    	var dt=JSON.stringify(data);
	    	    	  var values = [];
	    	    	 $('#section').hide();
	    	    
	    	          $.each(data.searchedlist, function( key, value ) {
	    	        		 $table.append('<caption>MyTable</caption>') 
	    	        	// thead
	    	        	.append('<thead>').children('thead')
	    	        	.append('<tr />').children('tr').append('<th>A</th><th>B</th><th>C</th><th>D</th>');

	           });
	    	    	
	    	    }
	    	});
	    }
	})});
	</script>
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
#nav{
 line-height:30px;
    background-color:#eeeeee;
    height:600px;
    width:300px;
    float:left;
    padding:5px;
    }
#section {
    width:350px;
    float:left;
    padding:10px;	 	 
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
<form role="search" method="get" action="search.htm">
    <div class="input-group">
      <input id= "text2" type="text" name="criteria" class="form-control" maxlength="10" placeholder="Search for courses & lessons">
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

<div id="section">
<table align = "center" style="width: 900px;" id ="table" border="1">
		   <tr>
                <th>Course</th>
                <th>Duration</th>
                <th>Faculty Teaching</th>
              </tr>
                <c:forEach var="searchedResult" items = "${searchedResult}">
                <c:set var="val" value="${val + 1}" />
          <tr>
           <td><a href="courseView.htm?var1=${searchedResult.subjectName}" target="_blank">${searchedResult.subjectName}</a></td>
        <td><input type="text" name="duration${val}" value ="${searchedResult.courseDuration}" readonly/></td> 
        <td><a href="profileView.htm?var=${searchedResult.getFaculty().facultyId}" target="_blank">${searchedResult.getFaculty().firstName}&nbsp;${searchedResult.faculty.lastName}</a></td>
          </c:forEach>  
        
		 </table>
</div>
<div id ="section1">
</div>
</body>
</html>

