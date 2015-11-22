<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
<link rel="stylesheet" href="/assets/css/style.css">
<link rel="stylesheet" href="/assets/css/fragmentstyles.css">
<link rel="stylesheet" href="/assets/css/login_error.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
</head>

<body>
	<div class="wrapper">
		<jsp:include page="header.jsp" />
	</div>
	<jsp:include page="fragments/userLoginFragment.jsp" />
	
	<!-- Javascript -->
	<script src="/assets/js/jquery-1.8.2.min.js"></script>
	<script src="/assets/js/jquery-1.10.2.min.js"></script>
	<script src="/assets/js/scripts.js"></script>
	<script src="/assets/js/errors.js"></script>
	<script type="text/javascript" src="/assets/js/jquery-1.10.2.min.js"></script>
	
</body>
</html>