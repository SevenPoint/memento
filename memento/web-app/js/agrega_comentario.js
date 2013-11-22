/*$(document).ready(function() {
   
    $('#boton1').click(function(e) {
       
			$("#comentario").text('<div class="well well-sm">'
		'<img src="images/imagen_perfil.jpg" alt="..." class="img-rounded">''<a href="" style="color:blue;"><h5><b>Pablo</a> dijo:</b></h5>'
		'<br/>'
		'<p></p>'
		'</div>');


    });
});*/

$(function(){
	$('input[name=comentar]').val();
	$("#boton1").click(function(){
	var valor = $('input[name=comentar]').val();
		var e=$('<div class="well well-sm"><img src="images/imagen_perfil.jpg" alt="..." class="img-rounded"></div>').html(valor); //crea un elemento var e=$("<p>")//
	$("#comentario").append(e);
	});
	
	
		
	
});

