
$(document).ready(function() {

	$('#form-container-1 form').submit(function(){
		var username = $(this).find('.username').val();
		var password = $(this).find('.password').val();
		if(username == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '27px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.username').focus();
			});
			return false;
		}
		if(password == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '96px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.password').focus();
			});
			return false;
		}
	});

	$('#form-container-2 form').submit(function(){
		var username = $(this).find('.username').val();
		var password = $(this).find('.password').val();
		if(username == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '27px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.username').focus();
			});
			return false;
		}
		if(password == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '96px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.password').focus();
			});
			return false;
		}
	});

	$('#form-container-3 form').submit(function(){
		var username = $(this).find('.username').val();
		var password = $(this).find('.password').val();
		if(username == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '27px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.username').focus();
			});
			return false;
		}
		if(password == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '96px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.password').focus();
			});
			return false;
		}
	});

	$('#form-container-4 form').submit(function(){
		var username = $(this).find('.username').val();
		var password = $(this).find('.password').val();
		if(username == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '27px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.username').focus();
			});
			return false;
		}
		if(password == '') {
			$(this).find('.error').fadeOut('fast', function(){
				$(this).css('top', '96px');
			});
			$(this).find('.error').fadeIn('fast', function(){
				$(this).parent().find('.password').focus();
			});
			return false;
		}
	});

	$('#form-container-1 form .username, #form-container-1 form .password').keyup(function(){
		$(this).parent().find('.error').fadeOut('fast');
	});

	$('#form-container-2 form .username, #form-container-2 form .password').keyup(function(){
		$(this).parent().find('.error').fadeOut('fast');
	});

	$('#form-container-3 form .username, #form-container-3 form .password').keyup(function(){
		$(this).parent().find('.error').fadeOut('fast');
	});

	$('#form-container-4 form .username, #form-container-4 form .password').keyup(function(){
		$(this).parent().find('.error').fadeOut('fast');
	});

	

});
