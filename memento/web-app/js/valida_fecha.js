$(document).ready(function() {
    $('input[name=fecha_in]').val();
    $('input[name=fecha_fn]').val();
    $('input[type=submit]').click(function(e) {
        var fecha_in = $('input[name=fecha_in]').val(),
            fecha_fn = $('input[name=fecha_fn]').val(),
            aFecIn = fecha_in.split('/'),
            aFecFn = fecha_fn.split('/'),
            bFecha = false,
            oDateIn = new Date(aFecIn[2], aFecIn[1], aFecIn[0]),
            oDateFn = new Date(aFecFn[2], aFecFn[1], aFecFn[0]);
        if (oDateIn.getTime() > oDateFn.getTime())
			/*$("#result").text('<p>La fecha de inicio debe ser menor a la de fin</p>');*/
			return false;
			
		else
		return true;

		
        /*if (oDateIn.getTime() < oDateFn.getTime())
            bFecha = true;
        $('p.result').text(bFecha ? 'SI' :  bFecha = true;);*/
    });
});