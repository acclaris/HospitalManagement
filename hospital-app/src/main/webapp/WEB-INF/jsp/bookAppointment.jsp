<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
<link rel="stylesheet" href="/assets/css/jquery-ui.css">
<link rel="stylesheet" href="/assets/css/reset.css">
<link rel="stylesheet" href="/assets/css/style.css">
<link rel="stylesheet" href="/assets/css/appointments.css">

</head>
<body>
	<div id="wrapper">
		<jsp:include page="header.jsp" />
		<span class="appointment-form-heading">Book a new appointment
			for patient ID 122354546</span>
		<span class="appointment-note" >N.B. : New appointments must be booked prior to a minimum of 7 days before consultation .</span>
		<div class="appointment-form-container">

			<form id="book-appointment-form" action="../j_spring_security_check"
				method="post">
				<br /> <span class="patient-details">Patient Details</span> <br />
				<br />
				<div class="patient-name-details">
					<label>Patient First Name : </label> <input type="text"
						id="firstName" class="plaintext" name="firstName"
						placeholder="First Name" pattern="^[A-Za-z ]+$" required /> <span class="tooltip">First Name
						either blank or invalid</span> <label>Patient Last Name : </label> <input
						type="text" id="lastName" name="lastName" class="plaintext"
						placeholder="Last Name" pattern="^[A-Za-z ]+$" required /> 
						<span class="tooltip">Last Name either blank or invalid<datalist></datalist></span>
				</div>
				<div class="short-field-container">
					<label class="short-input">Age (In Years) : </label> <input
						type="text" id="age" name="age" maxlength="3"
						class="plaintext short-input" placeholder="Age" pattern="^[0-9]+$" required /> <span
						class="tooltip tooltip-small">Age is blank or invalid</span>
				</div>

				<div class="short-field-container">
					<label class="short-input">Gender : </label> <select id="gender" name="gender"
						class="dropdown patient-details-dropdown" required>
						<option value="Select">--Select--</option>
						<option value="M">Male</option>
						<option value="F">Female</option>
					</select>
				</div>

				<div class="short-field-container">
					<label class="short-input">Blood Group : </label> <select  id="bloodGroup" name="bloodGroup"
						class="dropdown patient-details-dropdown" required>
						<option value="Select">--Select--</option>
						<option>A+ve</option>
						<option>A-ve</option>
						<option>B+ve</option>
						<option>B-ve</option>
						<option>O+ve</option>
						<option>O-ve</option>
						<option>AB+ve</option>
						<option>AB-ve</option>
					</select>
				</div>
				<div class="contact-details">
					<label>Contact Email Id : </label> <input type="email" id="emailId"
						class="plaintext" name="emailId" placeholder="E.g. john.doe@gmail.com" />
					<span class="tooltip">Email Id is invalid</span> 
					<label>Contact Number : </label>
					 <input type="tel" id="contactNumber" name="contactNumber"
						class="plaintext" placeholder="Phone number" pattern="^[0-9\ \(\)\+]{10}$" required /> <span
						class="tooltip">Contact Number is mandatory and have only 10 digits</span>
				</div>

				<span class="appointment-details">Appointment Details</span> <br />
				<br />
				<div class="branch-info-details">
					<label>Branch Name : </label> <input type="text" id="branchName"
						class="plaintext" name="branchName" placeholder="E.g. 221B, Baker Street" required />
					<span class="tooltip">Please select a branch</span> 
					
					<label>Department : </label> <select class="appointment-details-dropdown">
						<option>--Select--</option>
						<option>Surgery</option>
						<option>ENT</option>
						<option>Dentist</option>
						<option>Gynecologist</option>
						<option>Psychiatrist</option>
					</select> 
					 <label>Doctor
						Name : </label> <select class="appointment-details-dropdown">
						<option>--Select--</option>
						<option>Dr. Hannibal Lecter</option>
						<option>Dr. Hannibal Lecter</option>
						<option>Dr. Hannibal Lecter</option>
						<option>Dr. Hannibal Lecter</option>

					</select> 
					
					<label>Select
						Shift : </label> <select class="appointment-details-dropdown">
						<option>--Select--</option>
						<option>9:00 AM - 10:00 AM</option>
						<option>10:30 AM - 11:00 AM</option>
						<option>11.00 AM - 12:00 PM</option>
						<option>12:00 PM - 01:00 PM</option>
						<option>02:00 PM - 03:00 PM</option>
					</select>
					
				</div>
				<label class="datepicker-input">Appointment Date : </label> <input type="text" id="appointment-datepicker" placeholder="MM/DD/YYYY" required />
					<span class="tooltip">Username cannot be blank</span>
				
				
				<label class="comments-input">Reasons for Treatment / Any
					Allergies : </label>
				<textarea name="text" id="comments" class="comments" rows="10"
					cols="50" placeholder="E.g. : Cough and Cold, Surgery etc."></textarea>
				<button id="userLoginButton" type="submit">Confirm
					Appointment</button>
					
					
			</form>

		</div>

	</div>
	<!-- 	</div> -->




	<!-- Javascript -->
	<script src="/assets/js/jquery-1.10.2.min.js"></script>
	<script src="/assets/js/jquery-ui.js"></script>
	<script src="/assets/js/scripts.js"></script>
</body>
</html>