$(function(){
	//solving active menu problem
	
	switch(menu){
	
	case 'About Us':
		$('#about').addClass('active'); 
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active'); 
		break;
		
	case 'All Posts':
		$('#listPosts').addClass('active'); 
		break;
		
	default:
		$('#home').addClass('active');
		$('#a_'+menu).addClass('active');
	
	}
	
	
});