<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="patient-id-input-box" class="page-container patient-id-input-box">
	<a href="#" class="close"><img src="/assets/img/fancybox_close.png"
		class="btn_close" title="Close Window" alt="Close" /></a> <br /> 
	<div id="patient-id-input-container">
			<form method="post" action="/reset" id="patient-id-input-form">
				<span id="patient-id-input-text">Enter Patient ID or Contact Number :</span>
				<hr>
				<input id="patientId" class="patient-id-input" name="patientId" type="text" class="patientId"
					required /> <span class="tooltip tooltip-position">Patient details cannot be blank</span>
				<button class="patient-details-submit" id="patient-details-submit" type="submit">Continue</button>
				<span id="first-appointment-advice">First appointment with us ?</span>
				<a id="first-appointment-link" class="first-appointment-link" href="appointment/book/new">Click Here</a>
			</form>
		</div>

</div>