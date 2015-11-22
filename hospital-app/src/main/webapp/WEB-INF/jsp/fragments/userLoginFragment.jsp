<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="login-box" class="page-container">
	<a href="#" class="close"><img src="/assets/img/fancybox_close.png"
		class="btn_close" title="Close Window" alt="Close" /></a> <br /> <span
		class="form-title">LOGIN</span>
	<div class="form-container">
		<div id="login-form-container" class="inner-form-container">
			<form id="user-login" action="../j_spring_security_check" method="post">
				<br /> <input type="text" id="username" class="username"
					name="username" placeholder="Username" required /> <span
					class="tooltip">Username cannot be blank</span> <input
					type="password" id="password" name="password" class="password"
					placeholder="Password" required /> <span class="tooltip">Password
					cannot be blank</span>
				<button id="userLoginButton" type="submit">Sign In</button>
				<a id="forgot-password" href="/login/forgotpassword">Forgot Password ?</a> <br /> <br />
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
			<p class="info-subheading">Book medical appointments for patients</p>
		</div>
		<div class="info-data emergency">
			<p class="info-headline">Handle Emergencies</p>
			<p class="info-subheading">Assign ambulances and mobile ICUs</p>
		</div>
	</div>
	

<c:set var="spring_exception" value="${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}"/>
<c:if test="${not empty spring_exception}">
<div class="errorinfo">Invalid credentials or some error occurred</div>
</c:if>

</div>