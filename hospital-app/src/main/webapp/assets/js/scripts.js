
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





});
