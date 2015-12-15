<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="search-input-box" class="page-container search-input-box">
	<a href="#" class="close"><img src="/hospital-app/assets/img/fancybox_close.png"
		class="btn_close" title="Close Window" alt="Close" /></a> <br /> 
	<div id="search-input-container">
			<form method="post" action="/hospital-app/search" id="patient-id-input-form">
				<span id="search-input-text">Username :</span>
				<hr>
				<input id="searchId" class="search-input" name="searchId" type="text" required /> <span class="tooltip tooltip-position">Search field cannot be blank</span>
				<button class="search-submit" id="search-submit" type="submit">Continue</button>
			</form>
		</div>

</div>