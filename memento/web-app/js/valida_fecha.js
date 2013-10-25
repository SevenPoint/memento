$(function(){
	$("#boton").click(function(){
		var fecha_inicio = $('#input1').val();
	var fecha_fin = $('#input2').val();
	
	if(fecha_inicio > fecha_fin)
		var e=$("<p>").html("La fecha de incio debe ser menor"); 
		$("#contenedor").append(e);
	else
	return true;
		
});
