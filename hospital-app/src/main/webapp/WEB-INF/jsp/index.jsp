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
<link rel="stylesheet" href="assets/css/reset.css">
<link rel="stylesheet" href="assets/css/supersized.css">
<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet" href="assets/css/login.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
</head>

<body>
	<div class="wrapper">
		<div>
			<img src="assets/img/sitelogo.png" id="sitelogo" />
		</div>

		<div class="site-text-container site-text-color-top">Super</div>
		<div class="site-text-container word-spacing site-text-color-bottom">Medica</div>
		<img id="plus" src="assets/img/healthcare-icon.png" />

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


	<div id="login-box" class="page-container">
		<a href="#" class="close"><img src="assets/img/fancybox_close.png"
			class="btn_close" title="Close Window" alt="Close" /></a> <br /> <span
			class="form-title">LOGIN</span>
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

	<!-- Javascript -->
	<script src="assets/js/jquery-1.8.2.min.js"></script>
	<script src="assets/js/jquery-1.10.2.min.js"></script>
	<!-- 	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script> -->
	<script src="assets/js/supersized.3.2.7.min.js"></script>
	<script src="assets/js/supersized-init.js"></script>
	<script src="assets/js/scripts.js"></script>
	<script type="text/javascript" src="assets/js/jquery-1.10.2.min.js"></script>


</body>
</html>