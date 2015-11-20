<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>Welcome to SuperMedica Plus HealthCare Management System</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<!-- <link rel='stylesheet' -->
<!-- 	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'> -->
<!-- <link rel="stylesheet" href="assets/custom_css/search.css"> -->
<!-- <link rel="stylesheet" href="assets/custom_css/tables_min.css"> -->


<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
         <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script src="http://code.jquery.com/jquery-latest.js">   
        </script>
       <script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
function madeAjaxCall(){
 $.ajax({
  type: "get",
  url: "SearchController",
  cache: false,    
  data:$("#search").val()+ $("#selected").val(),
  success: function(response){
   $('#result').html("");
   var obj = JSON.parse(response);
   $('#result').html("First Name:- " + obj.firstName +"</br>Last Name:- " + obj.lastName  + "</br>Email:- " + obj.email);
  },
  error: function(){      
   alert('Error while request..');
  }
 });
}
</script>
</head>
<a href="">Create User</a>
<h2>${message}</h2>
<body>
<form id="form1">
<div>
<div>
Search:<input type="text" name="search" id="search">
<select id="selected">
  <option value="EMAIL_ID">EMAIL_ID</option>
  <option value="FIRST_NAME">FIRST_NAME</option>
  <option value="LAST_NAME">LAST_NAME</option>
 
 </select>
 <input type="submit" value="Search" onclick="madeAjaxCall();">
 </div>
<div id="result">
<!--  <table>
		<thead>
			<tr>
				<th>Select</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email Address</th>
				<th>Action</th>

			</tr>
		</thead>

		<tbody>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td><input type="checkbox" id="user1Check" name="user1Check" />
						<input type="hidden" name="user1Id" value="${user.userId}" /></td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.emailId}</td>
					<td><a href="">Edit</a>/<a href="">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>-->
	</div>
</div>
</form>
</body>
</html>