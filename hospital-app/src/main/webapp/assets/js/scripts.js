
$(document).ready(function() {
	$('a.book-appointment-window').click(function() {

		// Getting the variable's value from a link 
		var bookAppointmentBox = $(this).attr('href');

		//Fade in the Popup and add close button
		$(bookAppointmentBox).fadeIn(300);

		$(bookAppointmentBox).css("display","flex");
		$('input').val("");

		// Add the mask to body
		$('.wrapper').append('<div id="mask"></div>');
		$('#mask').fadeIn(300);

		return false;
	});

	$('a.login-window').click(function() {

		// Getting the variable's value from a link 
		var loginBox = $(this).attr('href');

		//Fade in the Popup and add close button
		$(loginBox).fadeIn(300);

		$(loginBox).css("display","flex");
		$('input').val("");

		// Add the mask to body
		$('.wrapper').append('<div id="mask"></div>');
		$('#mask').fadeIn(300);

		return false;
	});

	// When clicking on the button close or the mask layer the popup closed
	$('a.close, .wrapper').click(function() { 
		$('#mask , .page-container').fadeOut(300 , function() {
			$('#mask').remove();  
		}); 
		return false;
	});


	$(function() {
		$( "#appointment-datepicker" ).datepicker({

			changeMonth: true,
			changeYear: true,
			showOtherMonths: true,
			selectOtherMonths: true,
			minDate: "+1W"
		});
	});
	
	$('a.search-window').click(function() {

		// Getting the variable's value from a link 
		var bookAppointmentBox = $(this).attr('href');

		//Fade in the Popup and add close button
		$(bookAppointmentBox).fadeIn(300);

		$(bookAppointmentBox).css("display","flex");
		$('input').val("");

		// Add the mask to body
		$('.wrapper').append('<div id="mask"></div>');
		$('#mask').fadeIn(300);

		return false;
	});

});


$('#user-login').submit(function(){
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

$('#book-appointment-form').submit(function(){
	var plaintext = $(this).find('.plaintext').val();
	var selectOptionValue = $(this).find('.dropdown').options[$(this).find('.dropdown').selectedIndex].value;
	if(plaintext == '') {
		$(this).find('.error').fadeOut('fast', function(){
			$(this).css('top', '27px');
		});
		$(this).find('.error').fadeIn('fast', function(){
			$(this).parent().find('.plaintext').focus();
		});
		return false;
	}
	if(selectOptionValue == 'Select') {
		$(this).find('.error').fadeOut('fast', function(){
			$(this).css('top', '96px');
		});
		$(this).find('.error').fadeIn('fast', function(){
			$(this).parent().find('.dropdown').focus();
		});
		return false;
	}

});


