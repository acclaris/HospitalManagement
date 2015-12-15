
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
	<link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
	<link rel="stylesheet" href="/hospital-app/assets/css/reset.css">
	<link rel="stylesheet" href="/hospital-app/assets/css/supersized.css">
	<link rel="stylesheet" href="/hospital-app/assets/css/style.css">
	<link rel="stylesheet" href="/hospital-app/assets/css/fragmentstyles.css">
	<link rel="stylesheet" href="/hospital-app/assets/css/search.css">

</head>

<body>

	<div class="wrapper">
		<jsp:include page="header.jsp" />

		<div class="button-container">

			<a href="#login-box"
				class="btn btn-border color-1 material-design login-window"
				data-color="#2f5398">LOG IN AS A USER</a>

			<a href="#patient-id-input-box"
				class="btn btn-border color-1 material-design book-appointment-window"
				data-color="#2f5398">BOOK AN APPOINTMENT</a>

			<button id="view-patient-report"
				class="btn btn-border color-1 material-design  fancybox" href="#"
				data-color="#2f5398">VIEW PATIENT REPORT</button>
			
			<a href="#search-input-box"
				class="btn btn-border color-1 material-design search-window"
				data-color="#2f5398">SEARCH</a>
		</div>

	</div>

	<!-- Add frag jsp -->
	<jsp:include page="fragments/userLoginFragment.jsp" />
	<jsp:include page="fragments/patientIdInputFragment.jsp" />
	<jsp:include page="fragments/userSearchFragment.jsp" />

	<!-- Javascript -->
	<script src="/hospital-app/assets/js/jquery-1.8.2.min.js"></script>
	<script src="/hospital-app/assets/js/jquery-1.10.2.min.js"></script>
	<script src="/hospital-app/assets/js/supersized.3.2.7.min.js"></script>
	<script src="/hospital-app/assets/js/supersized-init.js"></script>
	<script src="/hospital-app/assets/js/scripts.js"></script>



</body>
</html>