$(document).ready(function(){

	$("#login-user").fancybox({
		type : "iframe",
		href : "login",
		padding : 5,
		width:parseInt($(window).width() * 0.6),
		height:parseInt($(window).height() * 2),
		autoScale:true,
		helpers : {
			title: {
				type: 'inside',
				position: 'top',

			},
			overlay : {
				css : {
					'background' : 'rgba(20, 30, 40, 0.7)'
				}
			}
		},
		nextEffect: 'fade',
		prevEffect: 'fade'
	});

});

function closeFancyBox(objToClose, objToOpen){
	
	parent.$.fancybox.close();
	parent.$(objToOpen).click();
	
}