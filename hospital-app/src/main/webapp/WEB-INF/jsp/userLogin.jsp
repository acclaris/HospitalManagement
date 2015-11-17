<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="/assets/css/reset.css">
<link rel="stylesheet" href="/assets/css/login.css">


<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

</head>

<body>


	<!-- <div class="error">Invalid username or password</div> -->
	
	<div class="page-container">

		<br /> <span class="form-title">LOGIN</span>
		<div class="form-container">
			<div id="login-form-container" class="inner-form-container">
				<form id="user-login" action="j_spring_security_check" method="post">
					<br /> <input type="text" id="username" class="username"
						name="username" placeholder="Username" required /> <span
						class="tooltip">Username cannot be blank</span> <input
						type="password" id="password" name="password" class="password"
						placeholder="Password" required /> <span class="tooltip">Password
						cannot be blank</span>
					<button id="userLoginButton" type="submit">Sign In</button>
					<a id="forgot-password" href="#">Forgot Password ?</a> <br /> <br />
					<br /> <br />
				</form>
			</div>
		</div>

		<div class="divider-container divider"></div>
		<div class="info-container">
			<div class="info-data user-account">
				<p class="info-headline">Manage user accounts</p>
				<p class="info-subheading">Create, edit and manage user accounts</p>
			</div>

			<div class="info-data appointment">
				<p class="info-headline">Take appointments</p>
				<p class="info-subheading">Book medical appointments for
					patients</p>
			</div>
			<div class="info-data emergency">
				<p class="info-headline">Handle Emergencies</p>
				<p class="info-subheading">Assign ambulances and mobile ICUs</p>
			</div>
		</div>


	</div>

	<div class="modal"></div>

	<!-- Javascript -->
	<script src="/assets/js/jquery-1.8.2.min.js"></script>
	<script src="/assets/js/scripts.js"></script>
	<script src="/assets/js/formactions.js" type="text/javascript"></script>
</body>
</html>