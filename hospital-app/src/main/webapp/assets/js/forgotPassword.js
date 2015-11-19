$(document).ready(function() {
	$('#forgot-password-form').submit(function(){
	var email = $(this).find('.email').val();
	if(email == '') {
		$(this).find('.error').fadeOut('fast', function(){
			$(this).css('top', '50px');
		});
		$(this).find('.error').fadeIn('fast', function(){
			$(this).parent().find('.email').focus();
		});
		return false;
	}

});
});
