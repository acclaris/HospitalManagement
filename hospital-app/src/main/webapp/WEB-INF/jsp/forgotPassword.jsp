<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Super Medica Forgot Password page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="/assets/css/reset.css">
<link rel="stylesheet" href="/assets/css/style.css">
<link rel="stylesheet" href="/assets/css/forgotPassword.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
</head>
<body>
	<div class="wrapper">
		<jsp:include page="header.jsp" />
		<div id="forgot-password-container">
			<span id="forgot-password-title">Forgot Password</span>
		<!-- 	<div class="forgot-password-success">
				Your password has been successfully reset and sent to your
				registered email address. 
				<a id="resend-email" href="#">Resend
					Email</a>
			</div> -->
			
			<!-- <div class="forgot-password-error">The email address you entered does not belong to any account</div> -->
			<form method="post" action="/reset" id="forgot-password-form">
				<span id="forgot-password-text">Enter your registered email
					address to reset your password</span>
				<hr>
				<input id="email" name="email" type="email" class="email"
					placeholder="Email Address" required /> <span class="tooltip">Email
					address is either blank or invalid</span>
				<button id="forgot-password-button" type="submit">Continue</button>
			</form>
		</div>
	</div>

	<!-- Javascript -->
	<!-- <script src="/assets/js/jquery-1.8.2.min.js"></script> -->
	<script src="/assets/js/jquery-1.10.2.min.js"></script>
	<script src="/assets/js/forgotPassword.js"></script>
</body>
</html>