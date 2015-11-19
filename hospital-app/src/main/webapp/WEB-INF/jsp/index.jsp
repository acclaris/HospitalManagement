
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>Welcome to SuperMedica Plus HealthCare Management System</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="/assets/css/reset.css">
<link rel="stylesheet" href="/assets/css/supersized.css">
<link rel="stylesheet" href="/assets/css/style.css">
<link rel="stylesheet" href="/assets/css/login.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
</head>

<body>
	<div class="wrapper">
		<div>
			<img src="/assets/img/sitelogo.png" id="sitelogo" />
		</div>

		<div class="site-text-container site-text-color-top">Super</div>
		<div class="site-text-container word-spacing site-text-color-bottom">Medica</div>
		<img id="plus" src="/assets/img/healthcare-icon.png" />

		<div class="button-container">

			<a href="#login-box"
				class="btn btn-border color-1 material-design login-window"
				data-color="#2f5398">LOG IN AS A USER</a>
			<!-- <button id="login-user"
				class="btn btn-border color-1 material-design fancybox"
				href="app/login" data-color="#2f5398">LOG IN AS USER</button> -->

			<button id="book-appointment"
				class="btn btn-border color-1 material-design  fancybox" href="#"
				data-color="#2f5398">BOOK AN APPOINTMENT</button>

			<button id="view-patient-report"
				class="btn btn-border color-1 material-design  fancybox" href="#"
				data-color="#2f5398">VIEW PATIENT REPORT</button>
		</div>


	</div>


	<jsp:include page="userLoginFragment.jsp" />

	<!-- Javascript -->
	<script src="/assets/js/jquery-1.8.2.min.js"></script>
	<script src="/assets/js/jquery-1.10.2.min.js"></script>
	<script src="/assets/js/supersized.3.2.7.min.js"></script>
	<script src="/assets/js/supersized-init.js"></script>
	<script src="/assets/js/scripts.js"></script>
	


</body>
</html>