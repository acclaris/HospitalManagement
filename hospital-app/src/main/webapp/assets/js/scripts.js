
$(document).ready(function() {

	$('form').submit(function(){
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

		/*		else if(username!='' && password!=''){

			$('body').addClass("loading");
			$('body', window.parent.document).css('pointer-events','none');

			var formData = $(this).serializeObject();

			alert(window.location.pathname.substring(0, window.location.pathname.indexOf("/",2)));

			$.ajax({
				type: 'POST',
				url:  window.location.pathname.substring(0, window.location.pathname.indexOf("/",2))+'/j_spring_security_check',
				cache: false,
				data:formData,
				dataType:'json',
				encode:true,
				success: function(data){

					$("div.error").css('display','block');
					$('body').removeClass("loading");
					$('body', window.parent.document).css('pointer-events','auto');

				},
				error : function(xhr, textStatus, errorThrown){



				}

			})

		}*/

	});

	$('a.login-window').click(function() {

		// Getting the variable's value from a link 
		var loginBox = $(this).attr('href');

		//Fade in the Popup and add close button
		$(loginBox).fadeIn(300);

		/*//Set the center alignment padding + border
		var popMargTop = ($(loginBox).height() + 24) / 2; 
		var popMargLeft = ($(loginBox).width() + 24) / 2; 

		$(loginBox).css({ 
			'margin-top' : -popMargTop,
			'margin-left' : -popMargLeft
		});*/
		
		$(loginBox).css("display","flex");

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





});
