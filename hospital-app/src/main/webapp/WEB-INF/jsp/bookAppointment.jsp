<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to SuperMedica - Book a new appointment</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="/assets/css/reset.css">
<link rel="stylesheet" href="/assets/css/style.css">
<link rel="stylesheet" href="/assets/css/appointments.css">

</head>
<body>
	<div id="wrapper">
		<jsp:include page="header.jsp" />
		<div id="login-box" class="page-container">
			<br /> <span class="form-title">Patient Details</span>
			<div class="form-container">
				<div id="login-form-container" class="inner-form-container">
					<form id="user-login" action="../j_spring_security_check"
						method="post">
						<br />

						<div>
							<label>Patient First Name : </label> <input type="text"
								id="username" class="username" name="username"
								placeholder="Username" required /> <span class="tooltip">Username
								cannot be blank</span> <label>Patient Last Name : </label> <input
								type="password" id="password" name="password" class="password"
								placeholder="Password" required /> <span class="tooltip">Password
								cannot be blank</span>
						</div>
						<div class="short-field-container">
							<label class="short-input">Patient Age (In Years) : </label> <input
								type="password" id="password" name="password"
								class="password short-input" placeholder="Password" required />
							<span class="tooltip">Password cannot be blank</span>
						</div>

						<div class="short-field-container">
							<label class="short-input">Patient Gender : </label> <input
								type="password" id="password" name="password"
								class="password short-input" placeholder="Password" required />
							<span class="tooltip">Password cannot be blank</span>
						</div>

						<div class="short-field-container">
							<label class="short-input">Patient Blood Group : </label> <input
								type="password" id="password" name="password"
								class="password short-input" placeholder="Password" required />
							<span class="tooltip">Password cannot be blank</span>
						</div>
						<div>
							<label>Email Id : </label> <input type="text"
								id="username" class="username" name="username"
								placeholder="Username" required /> <span class="tooltip">Username
								cannot be blank</span> <label>Patient Contact Number : </label> <input
								type="password" id="password" name="password" class="password"
								placeholder="Password" required /> <span class="tooltip">Password
								cannot be blank</span>
						</div>
						<br /> <br /> <br /> <br />
					</form>
				</div>

			</div>
		</div>
	</div>



	<!-- Javascript -->
	<script src="/assets/js/jquery-1.8.2.min.js"></script>
	<script src="/assets/js/jquery-1.10.2.min.js"></script>
	<script src="/assets/js/scripts.js"></script>
</body>
</html>