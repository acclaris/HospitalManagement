<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="search-input-box" class="page-container search-input-box">
	<a href="#" class="close"><img src="/hospital-app/assets/img/fancybox_close.png"
		class="btn_close" title="Close Window" alt="Close" /></a> <br /> 
	<div id="search-input-container">
			<form method="post" action="/hospital-app/search" id="patient-id-input-form">
				<span id="search-input-text">Username :</span>
				<hr>
				<input id="patientId" class="patient-id-input" name="patientId" type="text" class="patientId"
					required /> <span class="tooltip tooltip-position">Patient details cannot be blank</span>
				<button class="patient-details-submit" id="patient-details-submit" type="submit">Continue</button>
				<span id="first-appointment-advice">First appointment with us ?</span>
				<a id="first-appointment-link" class="first-appointment-link" href="appointment/book/new">Click Here</a>
			</form>
		</div>

</div>