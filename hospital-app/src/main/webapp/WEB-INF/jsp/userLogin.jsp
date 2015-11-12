<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="/assets/css/reset.css">
<link rel="stylesheet" href="/assets/css/login_signup.css">


<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

</head>

<body>


	<div class="page-container">

		<br /><span class="form-title">Log In As User</span>
		<div class="form-container">
			<div id="form-container-1" class="inner-form-container">
				<form id="user-login" class="librarian-log-in" action=""
					method="post">
					<br /> <input type="text" id="librarian-signin-username"
						name="username" class="username" placeholder="Username" required />
					<span class="tooltip">Username cannot be blank</span> <input
						type="password" id="librarian-signin-password" name="password"
						class="password" placeholder="Password" required /> <span
						class="tooltip">Password cannot be blank</span> <input
						type="password" id="librarian-signin-access-code"
						name="accessCode" class="password"
						placeholder="Librarian Access Code" required /> <span
						class="tooltip">Access Code cannot be blank</span>
					<button id="loginLibrarianButton" type="submit">Sign Me in</button>
					<br /> <br />
					
					<a rel="gallery" id="not-librarian" href="#" onclick="closeFancyBox(this, '#signup-librarian')" class="link-text fancybox">Not Registered ? Sign In</a>
					<br /> <br />
				</form>
			</div>
		</div>

	</div>


	<!-- Javascript -->
	<script src="/assets/js/jquery-1.8.2.min.js"></script>
	<script src="/assets/js/scripts.js"></script>
	<script src="/assets/js/formactions.js" type="text/javascript"></script>
</body>
</html>